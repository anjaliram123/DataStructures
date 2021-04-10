package stacks;

import java.util.ArrayList;

public class DailyTemperatures {
    public static void main(String[] args) {
        DailyTemperatures d = new DailyTemperatures();
        int [] T = {73,56,54,67};
        //int res[] = d.dailyTemperatures(T);
        int res[] = d.dailyTemperaturesUsingStack(T);
        for(int i :res) {
            System.out.println(i);
        }
    }

    public int[] dailyTemperatures(int[] T) {
        ArrayList<Integer> al = new ArrayList<>();
        int res [] = new int[T.length];
        int i=1;
        int j=0;
        while((i<=T.length) && (j<=T.length)) {
            if(j==T.length-1) {
                al.add(0);
                break;
            }
            if(T[i] > T[j]) {
                int val = i-j;
                al.add(val);
                j = j+1;
                i = j+1;
            } else {
                i=i+1;
            }
            if(i==T.length) {
                al.add(0);
                j=j+1;
                i=j+1;
            }
        }
         for(int k=0;k<res.length;k++){
             res[k] = al.get(k);
         }
         return res;
    }

    public int[] dailyTemperaturesUsingStack(int [] T) {
        int[] ans = new int[T.length];
        StackImpl<Integer> stackImpl = new StackImpl();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stackImpl.isEmpty() && T[i] >= T[stackImpl.peek()]) {
                stackImpl.pop();
            }
            ans[i] = stackImpl.isEmpty() ? 0 : stackImpl.peek() - i;
            stackImpl.push(i);
        }
        return ans;
    }
}
