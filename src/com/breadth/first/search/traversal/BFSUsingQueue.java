package com.breadth.first.search.traversal;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingQueue {

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

        BFSUsingQueue bf = new BFSUsingQueue();
        bf.printusingBFS(n1);
    }

    public void printusingBFS(Node n){
        Queue<Node> q = new LinkedList<>();

        if(n==null) {
            throw new NullPointerException();
        }
        q.add(n);
        while(!q.isEmpty()) {
            n = q.remove();
            System.out.println(n.data);
            if(n.left!=null) {
                q.add(n.left);
            }
            if(n.right!=null) {
                q.add(n.right);
            }
        }

    }





}
