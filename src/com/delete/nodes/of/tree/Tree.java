package com.delete.nodes.of.tree;

public class Tree {

    Node root;

    public Tree() {
        this.root=null;
    }

    public boolean deleteLeaf(int x) {
        Node curr = root;
        Node parent = root;
        boolean isLeftChild = false;

        while(curr.val!=x) {
            parent = curr;
            if(x < curr.val) {
                curr = curr.left;
                isLeftChild = true;
            } else {
                curr = curr.right;
                isLeftChild = false;
            }
            if(curr == null) {
                return false;
        }
    }

    //now we have the curr node whose value is equal to x
     //case1- to delete leaf nodes
    if((curr.left==null) && (curr.right==null)) {
          if(curr==root){
              root = null;
          }
          else if(isLeftChild) {
              parent.left = null;
          }
          else {
              parent.right = null;
          }
    }
    //case2. if node to be deleted has one child
        else if(curr.right == null) {
        if (curr == root) {
            root = curr.left;
        }
         else if (isLeftChild) {
            parent.left = curr.left;
        } else {
            parent.right = curr.left;
        }
    }
    else if(curr.left == null) {
            if(curr == root) {
                root = curr.right;
            }
          else if (isLeftChild) {
            parent.left = curr.right;
        } else {
            parent.right = curr.right;
        }
    }
    //case 3- if node to deleted has 2 children
        if(curr.left!=null && curr.right!=null) {
            Node successor = getSuccessor(curr);
            if(curr == root) {
                root = successor;
            }
            else if(isLeftChild){
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left =curr.left;
        }
        return true;
    }


    //if we have to delete  a node having two childs, we need successor
    //Successor is the smallest node on the right child of the node to be deleted.
    public Node getSuccessor(Node n) {
         Node successor = null;
         Node successorParent = null;
         Node curr = n.right;
         while(curr!=null) {
             successorParent = successor;
             successor = curr;
             curr = curr.left;
         }

         //check if successor has right child it cannot have left child
        //if it has right child add to left of successorParent
        if(successor.right!=null) {
             successorParent.left = successor.right;
             successor.right = n.right;
        }
        return successor;
    }
}
