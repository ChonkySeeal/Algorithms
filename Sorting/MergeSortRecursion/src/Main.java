import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int i;
        for (i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sort(arr, N);
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < N; i++) {
            sb.append(arr[i] + "\n");
        }
        bw.write((sb.toString()));
        bw.flush();
        bw.close();
        br.close();
    }

    static void merge(int[] arr, int[] L, int[] R, int n) {

        int i = 0, j = 0, k = 0;
        while (i < n / 2 && j < n - n / 2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n / 2) {
            arr[k++] = L[i++];
        }
        while (j < n - n / 2) {
            arr[k++] = R[j++];
        }

    }

    static void sort(int[] arr, int n) {
        if (n != 1) {
            int L[] = new int[n / 2];
            int R[] = new int[n - n / 2];

            for (int i = 0; i < n / 2; i++)
                L[i] = arr[i];
            for (int j = n / 2; j < n; j++)
                R[j - n / 2] = arr[j];
            sort(L, n / 2);
            sort(R, n - n / 2);
            merge(arr, L, R, n);
        }

    }
}
