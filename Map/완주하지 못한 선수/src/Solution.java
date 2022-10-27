import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        String ans = "";
        for (int i = 0; i < participant.length; i++) {
            hm.put(participant[i], hm.getOrDefault(participant[i], 0)+1);
        }

        for (int i = 0; i < completion.length; i++) {
            hm.put(completion[i], hm.get(completion[i]) - 1);
        }

        for (int i = 0; i < participant.length; i++) {
            if (hm.get(participant[i]) != 0) {
                ans = participant[i];
            }
        }

        return ans;
    }

}
