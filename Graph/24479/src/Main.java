import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    LinkedList<Integer>[] graph;
    boolean[] b;
    int count = 0;
    int[] ans;

    void DFS(int vertex) {
        b[vertex] = true;
        ans[vertex] = ++count;

        for (int next : graph[vertex]) {
            int nextV = next;
            if (!b[nextV]) {
                DFS(nextV);
            }
        }
    }

    void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        graph = new LinkedList[N];
        b = new boolean[N];
        ans = new int[N];
        Arrays.fill(ans, 0);
        for (int i = 0; i < N; i++) {
            graph[i] = new LinkedList<>();
        }
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 0; i < N; i++)
            Collections.sort(graph[i]);
        DFS(S - 1);
        for (int i = 0; i < N; i++)
            sb.append(ans[i]).append('\n');
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
