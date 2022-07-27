import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[min] > arr[j])
                    min = j;

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }

}
