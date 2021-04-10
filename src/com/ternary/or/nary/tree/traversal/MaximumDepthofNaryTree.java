package com.ternary.or.nary.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofNaryTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(10);
        t.root.left = new Node(12);
        t.root.right = new Node(15);
        t.root.center = new Node(8);
        t.root.left.left = new Node(5);
        t.root.left.right = new Node(6);

        MaximumDepthofNaryTree mc = new MaximumDepthofNaryTree();
        System.out.println(mc.maxDepth(t.root));
    }

    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();
        Node n = root;
        q.add(n);
        int countLeft = 1;
        int countRight = 1;
        int countCenter = 1;
        while(!q.isEmpty()) {
            n = q.remove();
            //System.out.println(n.data);
            if(n.left!=null) {
                countLeft++;
                q.add(n.left);
            }
            if(n.right!=null) {
                countRight++;
                q.add(n.right);
            }
            if(n.center!=null) {
                countCenter++;
                q.add(n.center);
            }
        }
        int max1 = Math.max(countLeft,countRight);
        int max2 = Math.max(max1,countCenter);

        return max2;
    }




}
