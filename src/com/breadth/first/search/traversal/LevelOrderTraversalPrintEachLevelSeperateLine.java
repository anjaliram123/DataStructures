package com.breadth.first.search.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalPrintEachLevelSeperateLine {

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
        LevelOrderTraversalPrintEachLevelSeperateLine l = new LevelOrderTraversalPrintEachLevelSeperateLine();
        l.levelOrderSeperateLine(t.root);

    }

    public void levelOrderSeperateLine(Node n) {
        Queue<Node> q = new LinkedList<>();
        q.add(n);
        int levelnodes = 0;
        while(!q.isEmpty()) {
            levelnodes = q.size();
            while(levelnodes > 0){
                Node a = q.remove();
                System.out.print(a.data+" ");
                if(a.left!=null) {
                    q.add(a.left);
                }
                if(a.right!=null) {
                    q.add(a.right);
                }
                levelnodes--;
            }
            System.out.println();
        }
    }
}
