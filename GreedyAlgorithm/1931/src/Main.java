import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int current = -1;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if (a1[1] == a2[1])
                    return a1[0] - a2[0];
                return a1[1] - a2[1];
            }
        });

        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= current) {
                ans++;
                current = arr[i][1];
            }
        }

        System.out.println(ans);

    }
}
