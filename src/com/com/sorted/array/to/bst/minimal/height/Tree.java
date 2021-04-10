package com.com.sorted.array.to.bst.minimal.height;

public class Tree {

    Node root;

    public Tree() {
        this.root = null;
    }

    public void printelements(Node n){
        Node curr = n;
        if(curr!=null) {
            System.out.println(curr.val);
            printelements(curr.left);
            printelements(curr.right);
        }
    }
}
