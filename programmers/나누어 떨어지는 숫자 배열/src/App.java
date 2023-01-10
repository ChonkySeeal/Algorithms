
import java.util.PriorityQueue;

public class App {

    public static int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] answer = { -1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                queue.add(arr[i]);
        }
        int size = queue.size();
        if (size == 0)
            return answer;
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 9, 7, 10 };
        int divisor = 5;
        int[] show = solution(arr, divisor);
        for (int i = 0; i < show.length; i++) {
            System.out.println(show[i]);
        }
    }
}
