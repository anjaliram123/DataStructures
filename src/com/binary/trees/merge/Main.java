package com.binary.trees.merge;

public class Main {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(1);
        t.insert(3);
        t.insert(2);
        t.insert(5);

        Tree t2 = new Tree();
        t2.insert(2);
        t2.insert(1);
        t2.insert(3);
        t2.insert(4);
        t2.insert(7);

        t.traverseinorder();
        System.out.println("*******************");
        t2.traverseinorder();
        System.out.println("*******************");

    }
}
