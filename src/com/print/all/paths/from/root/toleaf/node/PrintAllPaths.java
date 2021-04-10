package com.print.all.paths.from.root.toleaf.node;

import java.util.ArrayList;

public class PrintAllPaths {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node (2);
        t.root.right = new Node (3);
        t.root.left.left = new Node (4);
        t.root.left.left.left = new Node (7);
        t.root.right.left = new Node (6);
        t.root.right.left.left = new Node (8);
        t.root.right.left.right = new Node (9);
        PrintAllPaths paths = new PrintAllPaths();
        int [] path = new int [100];
        paths.printPaths(t.root, path, 0);
    }

    public void printPaths(Node root, int [] path, int pathLen){
        if(root==null){
            return;
        }
        path[pathLen]= root.data;
        pathLen++;
        //System.out.println("Pathelength " +pathLen);
        if(root.left==null && root.right==null){
            print(path,pathLen);
        }
        else{
            printPaths(root.left,path,pathLen);
            printPaths(root.right,path,pathLen);
        }
    }
    public void print(int [] path, int pathLen){
        for(int i=0;i<pathLen;i++){
            System.out.print(path[i]+ " ");
        }
        System.out.println();
    }

}
