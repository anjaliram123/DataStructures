package queues;

public class Tree {
   TreeNode root;
}

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode(int val) {
        this.val  = val;
        right = null;
        left = null;
    }
}
