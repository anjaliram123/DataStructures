package BinarySearchTreeImplementation;

import java.util.*;

public class RightSideViewofBT {

    public static void main(String[] args) {
        RightSideViewofBT r = new RightSideViewofBT();
        BinaryTree t = new BinaryTree();
        t.root = new TreeNode(1);
        t.root.left = new TreeNode(2);
        t.root.right = new TreeNode(3);
        t.root.left.left = new TreeNode(5);
        t.root.right.right  = new TreeNode(4);
        List<Integer> rightSideList = r.rightSideView(t.root);
        rightSideList.forEach(i -> System.out.print(" "+i));

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> bfsq = new LinkedList<>();
        traverse(root, bfsq, false);
        while(!bfsq.isEmpty()) {
            int i = bfsq.poll();
           res.add(i);
        }
        return res;
    }

    public void traverse(TreeNode node, Queue<Integer> bfsq, boolean right) {
        TreeNode curr = node;
        if(curr != null) {
            if(right) {
                bfsq.add(curr.data);
            }
        }
        traverse(curr.left, bfsq, false);
        traverse(curr.right, bfsq, true);

    }

}

