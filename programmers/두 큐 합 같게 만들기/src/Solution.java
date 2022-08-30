import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] queue1 = { 3, 2, 7, 2 };
        int[] queue2 = { 4, 6, 5, 1 };
        Solution s = new Solution();
        System.out.println(s.solution(queue1, queue2));
    }

    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;
        int count = 0;
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            q1.add(queue1[i]);
        }

        for (int i = 0; i < queue2.length; i++) {
            sum2 += queue2[i];
            q2.add(queue2[i]);
        }

        while (sum1 != sum2) {

            if (sum1 > sum2) {
                int temp = q1.remove();
                sum1 -= temp;
                sum2 += temp;
                q2.add(temp);
            } else {
                int temp = q2.remove();
                sum2 -= temp;
                sum1 += temp;
                q1.add(temp);
            }
            count++;
            if (count > (queue1.length + queue2.length) + 2)
                return -1;
        }
        return count;
    }
}
