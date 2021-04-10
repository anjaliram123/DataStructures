package com.com.searchelement.in;

public class Tree {
    Node root;


    public Tree() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if(root==null) {
            root = newNode;
            return;
        }
        Node curr = root;
        Node prev = null;
        while(true) {
            prev = curr;
            if(data<curr.data){
               curr = curr.left;
                if(curr==null) {
                    prev.left=newNode;
                    return;
                }
            }
            else {
                curr=curr.right;
                if(curr==null){
                    prev.right=newNode;
                    return;
                }
            }
        }
    }

    public void print(Node root) {
        //pre -order
        if(root!=null){
            print(root.left);
            System.out.println(" "+root.data);
            print(root.right);
        }
    }

    public boolean find(int data) {
        Node curr = root;
        while(curr!=null) {
            if(data==curr.data){
                return true;
            }
             else if(data < curr.data) {
                curr = curr.left;
            }else {
                curr = curr.right;
            }
        }
        return false;
    }
    //delete a leaf node
    public void deleteLeafNode(int data) {
        Node curr = root;
        Node parent = null;
        while(curr!=null) {
            parent = curr;
            if(data < curr.data) {
               curr = curr.left;
                 if(curr.data==data) {
                     parent.left=null;
                     return;
                 }
            } else if(data > curr.data) {
                curr = curr.right;
                if(curr.data == data) {
                    parent.right=null;
                    return;
                }
            }
        }
    }

    //delete node with one child



    public int getMin(Node root) {
        if(root!=null) {
            Node curr = root;
            Node prev = null;
            while(curr!=null) {
                prev = curr;
                curr = curr.left;
            }
            return prev.data;
        }
        return -1;
    }

    public int getMax(Node root) {
        if(root!=null) {
            Node curr = root;
            Node prev = null;
            while(curr!=null) {
                prev = curr;
                curr = curr.right;
            }
            return prev.data;
        }
        return -1;
    }

    //determine whther given binary tree is a binary search tree
    //method1
    public boolean isBST1(Node root) {
        if(root==null) {
            return true;
        }

        if((root.left!=null) && (getMaxOfSubtree(root.left)) > root.data) {
            return false;
        }

        if(root.right!=null && (getMinOfSubtree(root.right)) < root.data) {
            return false;
        }
        if(!isBST1(root.left) || (!isBST1(root.right))) {
            return false;
        }
       return true;
    }

    private int getMinOfSubtree(Node right) {
        Node curr = right;
        Node prev = null;
        while(curr!=null) {
            prev = curr;
            curr = curr.left;
        }
        return prev.data;
    }

    private int getMaxOfSubtree(Node left) {
        Node curr = left;
        Node prev = null;
        while(curr!=null) {
            prev = curr;
            curr = curr.right;
        }
        return prev.data;
    }

    //determine whether given binary tree is bst
    //method2
    public boolean isBstMaxmin(Node root, int max, int min) {
        if(root==null) {
            return true;
        }
        if(root.data > max || root.data < min) {
            return false;
        }
        return ( (isBstMaxmin(root.left, root.data, Integer.MIN_VALUE))
                 && (isBstMaxmin(root.right,Integer.MAX_VALUE, root.data)));
    }

    }


