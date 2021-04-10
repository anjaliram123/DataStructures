package com.balanced.binary.tree;

public class HeightofBinaryTree {

    //Height is the number of nodes along the longest way from root to leaf node
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

        HeightofBinaryTree hbt = new HeightofBinaryTree();
        int height = hbt.findHeight(t.root);
        System.out.println(height);
    }

    public int findHeight(Node n) {
        if(n==null) {
            return 0;
        }

        int leftHeight = findHeight(n.left);
        int rightHeight = findHeight(n.right);

        //height of right and left nodes +1 indicates the height of current node.
        return Math.max(leftHeight+1, rightHeight+1);
    }
}
