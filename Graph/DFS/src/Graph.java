import java.util.*;

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

    void DFS(int vertex) {
        v[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> itr = graph[vertex].listIterator();
        while (itr.hasNext()) {
            int adj = itr.next();
            if (!v[adj]) {
                DFS(adj);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.DFS(0);
    }
}
