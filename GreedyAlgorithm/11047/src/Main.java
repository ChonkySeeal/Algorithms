import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int target = Integer.parseInt(s[1]);
        int[] arr = new int[N];
        int num = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N - 1; i >= 0; i--) {
            if (target >= arr[i]) {
                num += target / arr[i];
                target %= arr[i];
            }
        }

        System.out.println(num);
    }
}
