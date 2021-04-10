package com.ternary.or.nary.tree.traversal;

public class Tree {

    Node root;

    public Tree() {
        this.root=null;
    }

    public void inordertraversal(Node n) {
        Node curr = n;
        if(n!=null) {
            System.out.println(n.data);
            inordertraversal(n.left);
            inordertraversal(n.center);
            inordertraversal(n.right);
        }
    }
}
