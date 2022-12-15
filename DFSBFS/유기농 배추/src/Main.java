import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {

    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] visit;
    static int count;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int testCase = 0; testCase < T; testCase++) {

            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];
            visit = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                cabbage[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int count = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (cabbage[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (cabbage[nx][ny] == 1 && !visit[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
