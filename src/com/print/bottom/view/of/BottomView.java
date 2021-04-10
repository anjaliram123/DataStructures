package com.print.bottom.view.of;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class BottomView {

    static TreeMap<Integer, ArrayList> maps = new TreeMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.left.right = new Node(9);
        t.root.left.left.left = new Node(8);
        t.root.left.right = new Node(5);
        t.root.right.right = new Node(7);

        BottomView b = new BottomView();
        b.getbottomview(t.root, 0);
        b.print(maps);
    }

    public void getbottomview(Node n, int level){
        if(n==null){
            return;
        }
        if(maps.containsKey(level)){
            ArrayList a = maps.get(level);
            a.add(n.data);
            maps.put(level, a);
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(n.data);
            maps.put(level, al);
        }

        getbottomview(n.left,level-1);
        getbottomview(n.right,level+1);
    }

    public void print(TreeMap map){
        Set<Integer> s = maps.keySet();
        for(int i:s){
            ArrayList<Integer> a = maps.get(i);
            System.out.println(a.get(a.size()-1));
        }
    }
}
