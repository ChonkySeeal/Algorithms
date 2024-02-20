import java.util.HashMap;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> names = new HashMap<>();
        for(String friend : friends) {
            names.put(friend, 0);
        }

        for(String gift : gifts) {
            String[] giverNtaker = gift.split(" ");
            names.put(giverNtaker[0], names.get(giverNtaker[0])+1);
        }

        int answer = 0;
        return answer;
    }
}
