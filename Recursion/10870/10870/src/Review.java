//submitted answer to https://www.acmicpc.net/problem/10870

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = factorial(N);
        System.out.println(result);
    }

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}