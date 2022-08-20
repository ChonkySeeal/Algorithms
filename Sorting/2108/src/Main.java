import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = Integer.MAX_VALUE;
        int mode = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            sum += value;
            count[value + 4000]++;
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }

        int freq = 0;
        int maxMode = 0;
        boolean b = false;

        for (int i = min + 4000; i <= max + 4000; i++) {

            if (count[i] > 0) {

                if (freq < (N + 1) / 2) {
                    freq += count[i];
                    median = i - 4000;
                }

                if (maxMode < count[i]) {
                    maxMode = count[i];
                    mode = i - 4000;
                    b = true;
                }

                else if (maxMode == count[i] && b == true) {
                    mode = i - 4000;
                    b = false;
                }

            }
        }
        System.out.println((int) Math.round((double) sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);

    }

}
