import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public int solution(int[] nums) {

        HashSet<Integer> mons = new HashSet<Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            mons.add(nums[i]);
        }

        int answer = 0;
        answer = len / 2 <= mons.size() ? len / 2 : mons.size();
        return answer;
    }
}
