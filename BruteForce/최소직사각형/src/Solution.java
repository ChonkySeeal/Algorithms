public class Solution {
    public int solution(int[][] sizes) {
        int width = 0, length = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            width = Math.max(width, Math.min(card[0], card[1]));
        }
        return length * width;
    }
}
