package BinarySearchTreeImplementation;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeafNodesinBT {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new TreeNode(2);
        bt.root.right = new TreeNode(9);
        bt.root.left = new TreeNode(7);
        bt.root.left.right = new TreeNode(6);
        bt.root.left.left = new TreeNode(3);
        bt.root.left.right.left = new TreeNode(4);
        bt.root.left.right.right = new TreeNode(5);
        SumOfLeafNodesinBT ss = new SumOfLeafNodesinBT();
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        int sumofall = ss.sumofall(bt.root, li, sum );
        System.out.println(sumofall);

    }

    public int sumofall(TreeNode root, List<Integer> li, int sum) {
        TreeNode curr = root;
        if(curr == null) {
            return 0;
        }
        if(curr.left == null && curr.right==null) {
            li.add(curr.data);
            sum = sum + curr.data;
            return sum;
        }

        int lsum = sumofall(curr.left, li, sum);
        int rsum = sumofall(curr.right, li,sum);

        return lsum + rsum;
    }


}
