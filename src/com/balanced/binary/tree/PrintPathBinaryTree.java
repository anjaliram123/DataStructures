package com.balanced.binary.tree;

public class PrintPathBinaryTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(7);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(6);
        t.root.right.right = new Node(7);

        PrintPathBinaryTree paths = new PrintPathBinaryTree();
        paths.hasPath(t.root, 10, " ");
    }


    public void hasPath(Node root, int sum, String path) {
        if (root != null) {
            if (root.data > sum) {
                return;
            }
            else {
                path = path+" "+ root.data;
                sum = sum - root.data;
                if (sum == 0) {
                    System.out.print(path);
                }
                hasPath(root.left, sum, path);
                hasPath(root.right, sum, path);
            }
        }
    }
}
