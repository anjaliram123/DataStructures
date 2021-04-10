package com.prac.trees;

public class Main {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(25);
        t.insert(20);
        t.insert(27);
        t.insert(15);
        t.insert(22);
        t.insert(26);
        t.insert(30);
        t.insert(29);
        t.insert(32);

        t.traverseinorder();
        System.out.println("************");
        //t.traversepreorder();
        TreeNode getNode = t.getElement(29);
        System.out.println(getNode.data);
        System.out.println(t.getMin());
        System.out.println(t.getMax());

    }
}
