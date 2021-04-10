package ArraysLearning.Leetcode.com;

import java.util.List;

public class MainTree {

    public static void main(String[] args) {
        Tree t = new Tree();
        Node n = new Node(12);
        t.root = n;
        n.left = new Node(6);
        n.right = new Node(14);
        n.left.left= new Node(2);
        n.left.right = new Node(7);
        n.right.right = new Node(17);
        n.right.left = new Node(13);
        t.preOrder(t.root);
        System.out.println("-------------------------------------------------------------------");
        t.postOrder(t.root);
        System.out.println("POST ORDER----------------------------------------");
        List<Integer> li = t.inOrder(t.root);
        for(int s:li){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------------------------");
        List<Integer> list = t.inOrderiterative(t.root);
        for(int s:list){
            System.out.println(s);
        }
        System.out.println("preorder - Iterative using queue --- this is wrong");
        List<Integer> lis = t.preOrderiterative(t.root);
        for(int s:lis){
            System.out.println(s);
        }
        System.out.println("preorder - Iterative using stack --- this is correct");
        List<Integer> liz = t.preOrderiterativeUsingStack(t.root);
        for(int s:liz){
            System.out.println(s);
        }
        System.out.println("Postorder Iterative using stack----");
        List<Integer> lipost = t.postOrderiterativeUsingStack(t.root);
        for(int i:lipost){
            System.out.println(i);
        }
        System.out.println("Max depth---------------");
        int max = t.maxDepth(t.root);
        System.out.println(max);
        System.out.println("Maxdepth2-----recursive");
        int max2 = t.maxDepth2(t.root);
        System.out.println(max2);
        System.out.println("Max-depth using stack");
        int max3 = t.maxDepthUsingStack(t.root);
        System.out.println(max3);
        System.out.println("----------------------------------BFSQ-----------------------------");
        List<List<Integer>> levelorder = t.levelOrderTraversal(t.root);
        for(List<Integer>ss : levelorder) {
            System.out.println(ss);
        }
        System.out.println("--------BFSQ ZIGZAG---------------------------------------------------------");
        List<List<Integer>> zigzag = t.zigzaglevelOrderTraversal(t.root);
        for(List<Integer> zig : zigzag) {
            System.out.println(zig);
        }

        System.out.println("--------------Diameter of a Binary Tree");
        int diameter = t.diameter(t.root);
        System.out.println("Diameter of a tree" +diameter);

    }
}
