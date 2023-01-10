import java.util.LinkedList;
import java.util.Queue;
import java.awt.Point;

public class App {

    static int[] dx = { 1, 0, 0, -1 };
    static int[] dy = { 0, 1, -1, 0 };

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] count = new int[n][m];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        count[0][0] = 1;
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            int currentCount = count[current.y][current.x];
            for (int i = 0; i < 4; i++) {
                Point newPoint = new Point(current.x + dx[i], current.y + dy[i]);
                if (newPoint.x >= 0 && newPoint.x < m && newPoint.y >= 0 && newPoint.y < n
                        && maps[newPoint.y][newPoint.x] == 1) {
                    count[newPoint.y][newPoint.x] = currentCount + 1;
                    maps[newPoint.y][newPoint.x] = 0;
                    queue.add(newPoint);
                }
            }
        }
        int answer = count[n - 1][m - 1];
        if (answer == 0)
            return -1;

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int[][] examples = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 1 } };
        System.out.println(solution(examples));
    }
}
