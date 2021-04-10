package com.ternary.or.nary.tree.traversal;

public class NaryTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(10);
        t.root.left = new Node(12);
        t.root.right = new Node(15);
        t.root.center = new Node(8);

        t.inordertraversal(t.root);
    }
}
