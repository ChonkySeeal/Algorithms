public class FullBinaryTree {

    Node root;

    boolean isFullBinaryTree(Node node) {
        if (node == null)
            return true;
        if (node.right == null && node.left == null)
            return true;
        if (node.right != null && node.left != null) {
            return isFullBinaryTree(node.right) && isFullBinaryTree(node.left);
        }
        return false;
    }

    public static void main(String args[]) {
        FullBinaryTree tree = new FullBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        if (tree.isFullBinaryTree(tree.root))
            System.out.print("The tree is a full binary tree");
        else
            System.out.print("The tree is not a full binary tree");
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
