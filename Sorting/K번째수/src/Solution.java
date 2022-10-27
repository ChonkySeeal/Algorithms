import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = slicing(array, commands[i][0], commands[i][1])[commands[i][2] - 1];
        }
        return answer;
    }

    public int[] slicing(int[] arr, int start, int end) {
        int[] sliced = new int[end - start + 1];
        for (int i = 0; i < sliced.length; i++) {
            sliced[i] = arr[i + start - 1];
        }
        Arrays.sort(sliced);
        return sliced;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        Solution sol = new Solution();
        int[] ans = sol.solution(arr, commands);
        System.out.println(Arrays.toString(ans));
    }
}
