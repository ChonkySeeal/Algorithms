import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    LinkedList<Integer>[] graph;
    boolean[] v;

    Graph(int vertices) {
        graph = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new LinkedList<>();
        }
        v = new boolean[vertices];
    }

    void addEdge(int v, int u) {
        graph[v].add(u);
    }

    void BFS(int vertex) {
        LinkedList<Integer> queue = new LinkedList();
        v[vertex] = true;
        queue.add(vertex);
        while (queue.size() != 0) {
            vertex = queue.poll();
            System.out.print(vertex + " ");
            Iterator<Integer> itr = graph[vertex].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!v[n]) {
                    v[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);
    }
}
