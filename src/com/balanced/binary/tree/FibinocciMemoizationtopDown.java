package com.balanced.binary.tree;

public class FibinocciMemoizationtopDown {

    public static void main(String[] args) {
        FibinocciMemoizationtopDown f = new FibinocciMemoizationtopDown();
        int n=10;
        int memo[] = new int[n+1];
        int a = f.get(n, memo);
        System.out.println(a);
    }

    //topdown approach
    public int get(int val, int memo[]){
        if(val == 0){
            return 0;
        }
        if(val == 1){
            return 1;
        }
       if(memo[val]!= 0){
            return memo[val];
       }else {
           memo[val] = get(val-1,memo)+get(val-2,memo);
       }
        return memo[val];
    }
}
