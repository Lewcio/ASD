package com.company;

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
    void inOrder() {
        inOrder(root);
    }
    private void inOrder(BSTNode root) {
        if (root.left != null) inOrder(root.left);
        System.out.print(root.value + ", ");
        if (root.right != null) inOrder(root.right);
    }
}
