package com.balanced.binary.tree;

public class fibonnociDP {

    public static void main(String[] args) {

        fibonnociDP f = new fibonnociDP();
        int a =f.get(10);
        System.out.println(a);
    }

    //Bottom up approach
    //Memoization
    //first store the known values in an array, so that we wont do any recursive calls
    public int get(int val) {
        int memo[] = new int[val+2];
        memo[0]=0;
        memo[1]=1;
        for(int i=2;i<=val;i++) {
            memo[i] = memo[i-1]+memo[i-2];
        }
        return memo[val];
    }
}
