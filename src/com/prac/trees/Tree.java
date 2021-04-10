package com.prac.trees;

public class Tree {

    TreeNode root;


    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    public void traverseinorder() {
        if(root!=null) {
            root.traverseinorder();
        }
    }

    public void traversepreorder() {
        if(root!=null) {
            root.traversepreorder();
        }
    }

    public TreeNode getElement(int value) {
       if((root!=null) && (root.data == value)) {
           return root;
       }
       else {
           return root.getElement(value);
       }
    }

    public int getMin() {
        if(root!=null) {
            return root.getMin();
        }
        else{
            return Integer.MIN_VALUE;
        }
    }

    public int getMax() {
        if(root!=null) {
            return root.getMax();
        }
        else{
            return Integer.MAX_VALUE;
        }
    }

}
