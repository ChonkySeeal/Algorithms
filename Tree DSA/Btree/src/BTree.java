public class BTree {

    private int T;
    private Node root;

    public class Node {
        int n;
        int[] key = new int[2 * T - 1];
        Node[] child = new Node[2 * T];
        boolean leaf = true;

        public int Find(int k) {
            for (int i = 0; i < this.n; i++) {
                if (this.key[i] == k) {
                    return i;
                }
            }
            return -1;
        }

    }

    public BTree(int t) {
        T = t;
        root = new Node();
        root.n = 0;
        root.leaf = true;
    }

    private Node Search(Node n, int key) {
        int i = 0;
        if (n == null)
            return n;
        for (i = 0; i < n.n; i++) {
            if (key < n.key[i])
                break;
            if (key == n.key[i])
                return n;

        }

        if (n.leaf)
            return null;
        else
            return Search(n.child[i], key);

    }

    private void Split(Node x, int pos, Node y) {
        Node z = new Node();
        z.leaf = y.leaf;
        z.n = T - 1;
        for (int j = 0; j < T - 1; j++) {
            z.key[j] = y.key[j + T];
        }
        if (!y.leaf) {
            for (int j = 0; j < T; j++) {
                z.child[j] = y.child[j + T];
            }
        }
        y.n = T - 1;
        for (int j = x.n; j >= pos + 1; j--) {
            x.child[j + 1] = x.child[j];
        }
        x.child[pos + 1] = z;

        for (int j = x.n - 1; j >= pos; j--) {
            x.key[j + 1] = x.key[j];
        }
        x.key[pos] = y.key[T - 1];
        x.n = x.n + 1;

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
