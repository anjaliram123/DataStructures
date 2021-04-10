package com.balanced.binary.tree;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node n1 = new Node(5);
        t.root = n1;
        n1.left = new Node(10);
        n1.right = new Node(15);
        n1.left.left = new Node(20);
        n1.left.right = new Node(25);
        n1.right.left = new Node(30);
        n1.right.right = new Node(35);
    }


    public boolean isBalancedNaive(Node n) {
        if(n==null) {
            return true;
        }
        int diff = getHeight(n.left) - getHeight(n.right);
        if(Math.abs(diff)>1){
            return false;
        }else{
            return isBalancedNaive(n.left) && isBalancedNaive(n.right);
        }
    }

    public int getHeight(Node n) {
        if(n==null) {
            return 0;
        }
        int rightHeight = getHeight(n.right);
        int leftHieght = getHeight(n.left);
        return Math.max(rightHeight+1, leftHieght+1);
    }


}
