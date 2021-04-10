package com.com.searchelement.in;

public class ConvertBSTtoGreaterSumTree {

    public static int sum = 0;
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(10);
        t.insert(6);
        t.insert(13);
        t.insert(9);
        t.insert(2);
        t.insert(21);
        t.insert(12);
        ConvertBSTtoGreaterSumTree cgbs = new ConvertBSTtoGreaterSumTree();
        Node n = cgbs.convert(t.root);
        t.print(n);
    }

    public Node convert(Node root) {
        if(root != null) {
            convert(root.right);
            //put data in temp varaible
            int temp = root.data;

            //update data till previously visited node
            root.data = sum;

            //updte sum
            sum = sum + temp;

            convert(root.left);
        }
        return root;
    }
}
