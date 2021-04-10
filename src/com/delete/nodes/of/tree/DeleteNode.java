package com.delete.nodes.of.tree;

public class DeleteNode {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node n1 = new Node(20);
        Node n2 = new Node(15);
        Node n3 = new Node(25);
        Node n4 = new Node(10);
        Node n5 = new Node(18);
        Node n6 = new Node(17);
        Node n7 = new Node(19);
        Node n8 = new Node(12);
        Node n9 = new Node(16);

        t.root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.right = n8;

        n2.right = n5;
        n5.right = n7;
        n5.left = n6;
        n6.left = n9;

        System.out.println(t.deleteLeaf(15));
    }
}
