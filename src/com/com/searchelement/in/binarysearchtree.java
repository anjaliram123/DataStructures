package com.com.searchelement.in;

public class binarysearchtree {


    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(10);
        t.insert(6);
        t.insert(13);
        t.insert(9);
        t.insert(2);
        t.insert(21);
        t.insert(12);

        Tree t2 = new Tree();
        t2.root = new Node(10);
        t2.root.left = new Node(21);
        t2.root.right = new Node(22);

         t.print(t.root);
        //System.out.println(t.find(2));
       // t.deleteLeafNode(2);
        //t.deleteLeafNode(12);
        System.out.println("*****************************************************");
        //t.print(t.root);
        //System.out.println(t.getMin(t.root));
       // System.out.println(t.getMax(t.root));
        System.out.println(t.isBST1(t.root));
        System.out.println(t2.isBstMaxmin(t2.root,Integer.MAX_VALUE, Integer.MIN_VALUE));






    }
}
