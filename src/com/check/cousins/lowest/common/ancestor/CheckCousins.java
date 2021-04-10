package com.check.cousins.lowest.common.ancestor;

public class CheckCousins {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        Node x1 = new Node(2);
        Node y1 = new Node(3);
        t.root.left = x1;
        t.root.right = y1;
        t.root.left.left = new Node(4);
        t.root.right.left = new Node(6);
        Node x2 = new Node(7);
        Node y2 = new Node(9);
        t.root.right.left.left = new Node(8);
        t.root.right.left.right = y2;
        t.root.left.left.left = x2;
        CheckCousins cousins = new CheckCousins();
       boolean result= cousins.check(t.root, x2,y2);
        System.out.println(result);
    }

    public boolean check(Node root, Node x, Node y){
        if(getHeight(root, x, 1)!=getHeight(root, y, 1)){
            return false;
        }
        else{
            if(sameParent(root, x, y)==false){
                return true;
            }else{
                return false;
            }
        }
    }

    public int getHeight(Node root, Node x, int height){
        if(root==null){
            return 0;
        }
        if(root == x){
            return height;
        }

        int level = getHeight(root.left, x, height+1);
        if(level!=0){
            return level;
        }
        return getHeight(root.right, x, height+1);
    }

    public boolean sameParent(Node root, Node x, Node y){
        if(root==null){
            return false;
        }
        return ((root.left == x && root.right==y) || (root.left==y && root.right==x) ||
        sameParent(root.left, x, y) || sameParent(root.right, x, y));
        }

}
