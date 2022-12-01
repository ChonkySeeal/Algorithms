import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }
        int answer = 0;

        while (q.size() > 1 && q.peek() < K) {
            int fEle = q.poll();
            int sEle = q.poll();

            int sum = fEle + (sEle * 2);
            q.add(sum);
            answer++;
        }

        if (q.size() <= 1 && q.peek() < K) {
            answer = -1;
        }

        return answer;
    }
}