package com.balanced.binary.tree;

public class fibonnoci {

    public static void main(String[] args) {

        fibonnoci f = new fibonnoci();
        System.out.println(f.get(10));
    }

    public int get(int val) {
        if(val == 0){
            return 0;
        }
        if(val == 1) {
            return 1;
        }
        else{
            int f = get(val-1)+get(val-2);
            return f;
        }
    }
}
