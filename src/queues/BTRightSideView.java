package queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BTRightSideView {

    public static void main(String[] args) {
        BTRightSideView bt = new BTRightSideView();
        Tree tr = new Tree();
        TreeNode trNode  = new TreeNode(1);
        tr.root = trNode;
        TreeNode trNodel  = new TreeNode(2);
        TreeNode trNoder  = new TreeNode(3);
        trNode.left = trNodel;
        trNode.right = trNoder;
        List<Integer> res = bt.rightSideView(tr.root);
        for(int val : res) {
            System.out.println(val);
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        List<Integer> rightSide =new ArrayList<>();

        q.offer(root);
        while(!q.isEmpty()) {
            int levelLength = q.size();

            for(int i=0; i<levelLength;i++) {
                TreeNode n = q.poll();
                if(i == levelLength-1) {
                    rightSide.add(n.val);
                }
                if(n.left!=null) {
                    q.offer(n.left);
                }
                if(n.right!=null) {
                    q.offer(n.right);
                }
            }

        }
        return rightSide;
    }
}
