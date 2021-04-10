package com.com.sorted.array.to.bst.minimal.height;

public class SorttoBSTMinimalHeight {

    final static Tree t = new Tree();
    public static void main(String[] args) {

        int a[] ={1,2,3,4,5,6};
        int start = 0;
        int end = a.length-1;

        Node n = convert(a, start,end);
        t.printelements(n);
    }

    public static Node convert(int a[], int start, int end) {
        if(start>end) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(a[mid]);

        root.left = convert(a,start,mid-1);
        root.right = convert(a,mid+1,end);

        return root;
    }
}
