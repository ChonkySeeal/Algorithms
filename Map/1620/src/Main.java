import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> nameHM = new HashMap<>();
        HashMap<String, String> numberHM = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            nameHM.put(br.readLine(), String.valueOf(i));
        }
        for (Entry<String, String> entry : nameHM.entrySet()) {
            numberHM.put(entry.getValue(), entry.getKey());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String v = br.readLine();
            if (nameHM.containsKey(v))
                sb.append(nameHM.get(v)).append("\n");
            if (numberHM.containsKey(v))
                sb.append(numberHM.get(v)).append("\n");
        }

        System.out.print(sb);

    }
}
