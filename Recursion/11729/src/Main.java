import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');
        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    static void hanoi(int top, int from, int temp, int to) {
        if (top == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            hanoi(top - 1, from, to, temp);
            sb.append(from + " " + to + "\n");
            hanoi(top - 1, temp, from, to);
        }
    }
}
