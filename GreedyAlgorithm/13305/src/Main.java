import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] cities = new long[N];
        long[] dis = new long[N - 1];
        for (int i = 0; i < N - 1; i++) {
            dis[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cities[i] = Long.parseLong(st.nextToken());
        }
        long ans = 0;
        long smallest = cities[0];
        for (int i = 0; i < N - 1; i++) {

            if (cities[i] < smallest) {
                smallest = cities[i];
            }
            ans += smallest * dis[i];
        }
        System.out.println(ans);

    }
}