import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // int num = 666;
        // int count = 1;

        // while (count != N) {
        // num++;
        // if (String.valueOf(num).contains("666")) {
        // count++;
        // }
        // }
        // System.out.println(num);
        if (N == 1)
            System.out.println(666);
        else
            solve(N);

    }

    public static void solve(int N) {
        int count = 1;
        int prev = 0;
        int num = 0;

        while (true) {

            if (prev % 1000 == 666) {
                num = 0;
                for (int i = 0; i < 1000; i++) {
                    if (count == N) {
                        System.out.println(prev * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                prev++;
            } else if (prev % 100 == 66) {
                num = 600;
                for (int i = 0; i < 100; i++) {
                    if (count == N) {
                        System.out.println(prev * 1000 + num);
                        return;
                    }
                    count++;
                    num++;
                }
                prev++;
            } else if (prev % 10 == 6) {
                num = 660;
                for (int i = 0; i < 10; i++) {
                    if (count == N) {
                        System.out.println(prev * 1000 + num);
                        return;
                    }

                    count++;
                    num++;
                }
                prev++;
            }

            else {
                num = 666;
                if (count == N) {
                    System.out.println(prev * 1000 + num);
                    return;
                }
                prev++;
                count++;
            }
        }

    }
}
