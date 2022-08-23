import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (hm.containsKey(val))
                hm.put(val, hm.get(val) + 1);
            else
                hm.put(val, 1);
        }
        int M = Integer.parseInt(br.readLine());
        int[] ans = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int val = Integer.parseInt(st.nextToken());
            sb.append(hm.getOrDefault(val, 0)).append(" ");
        }
        System.out.println(sb);

    }
}
