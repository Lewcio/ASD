public class BinarySearchTree {
    private BSTNode root = null;

    void insert(int value) {
        if (root != null)
            insert(root, value);
        else
            root = new BSTNode(null, null, value);
    }
    private void insert(BSTNode node, int value) {
        if (node.value >= value) {
            if (node.left != null)
                insert(node.left, value);
            else
                node.left = new BSTNode(null, null, value);
        } else {
            if (node.right != null)
                insert(node.right, value);
            else
                node.right = new BSTNode(null, null, value);
        }
    }
    boolean member(int value) {
        return member(root, value);
    }
    private boolean member(BSTNode root, int value) {
        if (root.value == value) return true;
        else if (root.left != null) return member(root.left, value);
        else if (root.right != null) return member(root.right, value);
        return false;
    }
    // in-order
    void inOrder() {
        inOrder(root);
    }
    private void inOrder(BSTNode root) {
        if (root.left != null) inOrder(root.left);
        System.out.print(root.value + ", ");
        if (root.right != null) inOrder(root.right);
    }
    // pre-order
    void preOrder() {
        preOrder(root);
    }
    private void preOrder(BSTNode root) {
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
        System.out.print(root.value + ", ");
    }
    // post-order
    void postOrder() {
        postOrder(root);
    }
    private void postOrder(BSTNode root) {
        System.out.print(root.value + ", ");
        if (root.left != null) postOrder(root.left);
        if (root.right != null) postOrder(root.right);
    }
}
