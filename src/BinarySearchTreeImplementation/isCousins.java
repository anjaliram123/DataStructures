package BinarySearchTreeImplementation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class isCousins {

    public static void main(String[] args) {
        isCousins isCousins = new isCousins();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        boolean areThey = isCousins.isCousins(root, 2,4);
        System.out.println(areThey);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) {
            return false;
        }
        boolean iscus = false;
        Map<Integer,Integer> maps = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        int xdepth = 0;
        int ydepth = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.add(curr.left);
                    if(x == curr.left.data || y == curr.left.data) {
                        maps.put(curr.left.data, curr.data);
                    }
                    if(x == curr.left.data) {
                        xdepth = depth;
                    } else if (y == curr.left.data){
                        ydepth = depth;
                    }
                }
                if(curr.right != null) {
                    q.add(curr.right);
                    if(x == curr.right.data || y == curr.right.data) {
                        maps.put(curr.right.data, curr.data);
                    }
                    if(x== curr.right.data) {
                    xdepth = depth;
                } else if (y == curr.right.data) {
                        ydepth = depth;
                    }
                }
            }
            depth++;
        }

        int a = 0;
        int b = 0;
        if(maps.get(x) != null) {
            a = maps.get(x);
        }
        if(maps.get(y) != null) {
            b = maps.get(y);
        }
        if(a != b && xdepth == ydepth) {
            iscus = true;
        }
        return iscus;
    }
}
