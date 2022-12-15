import java.util.Stack;

public class App {
    static int numberOfArea = 0;
    static int maxSizeOfOneArea = 0;
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || picture[i][j] == 0)
                    continue;
                maxSizeOfOneArea = Math.max(dfs(i, j, picture), maxSizeOfOneArea);
                numberOfArea++;
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static int dfs(int x, int y, int[][] picture) {
        Stack<int[]> s = new Stack<int[]>();
        s.push(new int[] { x, y });
        int count = 0;
        while (!s.isEmpty()) {
            int[] temp = s.pop();
            int row = temp[0];
            int col = temp[1];
            if (visited[row][col])
                continue;
            visited[row][col] = true;
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = row + dx[i];
                int ny = col + dy[i];
                if (nx < 0 || ny < 0 || nx >= picture.length || ny >= picture[0].length)
                    continue;
                if (picture[nx][ny] == picture[x][y] && !visited[nx][ny]) {
                    s.push(new int[] { nx, ny });
                }

            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
                { 0, 0, 0, 3 } };
        App app = new App();
        System.out.println(app.solution(6, 4, picture));
    }

}
