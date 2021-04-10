package com.prac.trees;

public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(data == value) {
            return;
        }
        if(data < value) {
            if(right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        } else{
            if(left==null) {
                left = new TreeNode(value);
            }else {
                left.insert(value);
            }
        }
    }

    public void traverseinorder() {
        if(left!=null) {
            left.traverseinorder();
        }
        System.out.println(data);
        if(right!=null) {
            right.traverseinorder();
        }
    }

    public void traversepreorder() {
        System.out.println(data);
        if(left!=null) {
            left.traverseinorder();
        }
        if(right!=null) {
            right.traversepreorder();
        }
    }

    public TreeNode getElement(int value) {
        if(value == data) {
            return this;
        }
       if(value < data) {
            if(left!=null) {
               return left.getElement(value);
            }
       } else if(value > data) {
            if(right!=null) {
                return right.getElement(value);
            }
       }
       return null;
    }

    public int getMin() {
        if(left!=null) {
            return left.getMin();
        } else{
            return this.data;
        }
    }

    public int getMax() {
        if(right!=null){
            return right.getMax();
        } else {
            return this.data;
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
