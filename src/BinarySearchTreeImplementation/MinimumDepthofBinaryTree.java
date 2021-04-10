package BinarySearchTreeImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(3);
        bt.root.right = new TreeNode(20);
        bt.root.left = new TreeNode(9);
        bt.root.right.left = new TreeNode(15);
        bt.root.right.right = new TreeNode(7);
        /*bt.root.right.right = new TreeNode(3);
        bt.root.right.right.right = new TreeNode(4);
        bt.root.right.right.right.right = new TreeNode(5);
        bt.root.right.right.right.right.right = new TreeNode(6);
        bt.root.right.right.right.right.right.right = new TreeNode(7);*/
        MinimumDepthofBinaryTree md = new MinimumDepthofBinaryTree();
        int minDepth = md.mindepth(bt.root);
        System.out.println(minDepth);
    }

    public int mindepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 1;
        q.add(root);
        while(!q.isEmpty()) {
            //if we use for(int i=0;i<q.size();i++) it keeps looping and doesnt increment depth++; as we keep increasing q.size value.
            //most important thing about BFS.
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
