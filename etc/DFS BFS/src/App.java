import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static boolean[] visited = { false, false, false, false, false, false, false, false, false };
    public static int[][] graph = { {},
            { 2, 3, 8 }, // 1
            { 1, 7 }, // 2
            { 1, 4, 5 }, // 3
            { 3, 5 }, // 4
            { 3, 4 }, // 5
            { 7 }, // 6
            { 2, 6, 8 }, // 7
            { 1, 7 } }; // 8

    public static void main(String[] args) throws Exception {
        bfs(1);

    }

    public static void dfs(int n) {
        visited[n] = true;
        System.out.print(" " + n + " ");
        for (int i : graph[n]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void dfsStack(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {

                visited[node] = true;
                System.out.print(" " + node + " ");
                for (int i = graph[node].length - 1; i >= 0; i--) {
                    if (!visited[graph[node][i]]) {
                        stack.push(graph[node][i]);

                    }
                }
            }

        }
    }

    public static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited[node]) {

                visited[node] = true;
                System.out.print(" " + node + " ");
                for (int i : graph[node]) {
                    if (!visited[i]) {
                        queue.add(i);

                    }
                }
            }

        }
    }

}
