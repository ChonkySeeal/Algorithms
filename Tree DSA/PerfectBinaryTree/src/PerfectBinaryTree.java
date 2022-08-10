public class PerfectBinaryTree {

    static int depth(Node node) {
        int d = 0;
        while (node != null) {
            d++;
            node = node.left;
        }
        return d;
    }

    static boolean is_perfect(Node root, int d, int level) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return d == level + 1;

        if (root.left == null || root.right == null)
            return false;

        return is_perfect(root.left, d, level+1) && is_perfect(root.right, d, level+1)
    }

    static boolean is_perfect(Node root) {
        int d = depth(root);
        return is_perfect(root, d, 0);
    }

    public static void main(String[] args) throws Exception {
        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (is_perfect(root) == true)
            System.out.println("The tree is a perfect binary tree");
        else
            System.out.println("The tree is not a perfect binary tree");
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        data = data;
        left = right = null;
    }

}
