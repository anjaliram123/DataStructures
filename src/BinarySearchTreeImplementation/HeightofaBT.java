package BinarySearchTreeImplementation;

public class HeightofaBT {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(3);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.right.right = new TreeNode(6);
        bt.root.right.right.right = new TreeNode(7);


        HeightofaBT h = new HeightofaBT();
        int height = h.getHeight(bt.root);



        System.out.println("The height of tree is "+height);
    }

    private int getHeight(TreeNode root) {
        TreeNode curr = root;
        if(curr == null) {
            return 0;
        }
        int lheight = getHeight(curr.left);
        int rheight = getHeight(curr.right);

        return Math.max(lheight, rheight) + 1;
    }
}
