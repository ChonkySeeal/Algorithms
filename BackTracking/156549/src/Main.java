import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static int[] arr;
    public static boolean[] v;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int N = Integer.parseInt(st[0]);
        int M = Integer.parseInt(st[1]);  
        v = new boolean[N];
        arr = new int[M];
        
        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int d) {
        if(d==M) {
            for(int val:arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i =0;i<N;i++) {
            if(v[i] == false) {
                v[i] = true;
                arr[d] = i + 1;
                dfs(N, M, d+1);
                v[i] = false;
                
            }
        }
    }
}
