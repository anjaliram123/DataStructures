package com.balanced.binary.tree;

public class isBalancedRightApproach {

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
        //n1.right.right.left  = new Node(32);
        //n1.right.right.left.left = new Node(33);

        isBalancedRightApproach br = new isBalancedRightApproach();
        boolean value = br.isBalanced(t.root);
        System.out.println(value);
    }

    public boolean isBalanced(Node root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public int checkHeight(Node n) {
        if(n==null) {
            return 0;
        }

        int leftHeight = checkHeight(n.left);
        if(leftHeight==Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        int rightHeight = checkHeight(n.right);
        if(rightHeight==Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int diff = leftHeight - rightHeight;
        if(Math.abs(diff) > 1) {
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(leftHeight + 1, rightHeight + 1);
        }
    }
}
