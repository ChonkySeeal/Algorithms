import java.util.HashSet;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int answer = n - lost.length;
        for (int r : reserve) {
            hs.add(r);
        }

        for (int i = 0; i < lost.length; i++) {
            if (hs.contains(lost[i])) {
                answer++;
                hs.remove(lost[i]);
                lost[i] = -1;
            }
        }

        for (int i = 0; i < lost.length; i++) {

            if (hs.contains(lost[i] - 1)) {
                answer++;
                hs.remove(lost[i] - 1);
            } else if (hs.contains(lost[i] + 1)) {
                answer++;
                hs.remove(lost[i] + 1);
            }
        }

        return answer;
    }
}
