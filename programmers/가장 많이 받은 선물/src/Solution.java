import java.util.HashMap;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] count = new int[friends.length];
        int[][] exchange = new int[friends.length][friends.length];

        for(int i = 0;i < friends.length; i++) {
            map.put(friends[i], i);
        }

        for(String gift : gifts) {
            String[] c = gift.split(" ");
            count[map.get(c[0])]++;
            count[map.get(c[1])]--;
            exchange[map.get(c[0])][map.get(c[1])]++;
        }

        int answer = 0;
        for(int i =0; i < friends.length; i++) {
            int cnt = 0;
            for(int j =0; j < friends.length; j++) {
                if(i == j) continue;
                if (exchange[i][j] > exchange[j][i]) cnt++;
                else if (exchange[j][i] == exchange[i][j] && count[i] > count[j] ) cnt++;
            }
            answer = Math.max(answer, cnt);
        }
            return answer;
    }

}
