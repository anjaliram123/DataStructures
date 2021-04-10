package stacks;

import java.util.Stack;

public class SubArrayMinimumStack {

    public static void main(String[] args) {
        SubArrayMinimumStack sb = new SubArrayMinimumStack();
        int [] arr = {3,1,2,4};
        int sum = sb.sumSubarrayMins(arr);
        System.out.println("The min sum is " +sum);

    }

    public int sumSubarrayMins(int[] A) {
        int MOD = 1_000_000_007;
        int N = A.length;

        // prev has i* - 1 in increasing order of A[i* - 1]
        // where i* is the answer to query j
        Stack<Integer> stack = new Stack();
        int[] prev = new int[N];
        //prev[i] gives distance between this element and previous less element
        for (int i = 0; i < N; ++i) {
            while (!stack.isEmpty() && A[i] <= A[stack.peek()])
                stack.pop();
            prev[i] = stack.isEmpty() ? i+1 : i-stack.peek();
            stack.push(i);
        }

        // next has k* + 1 in increasing order of A[k* + 1]
        // where k* is the answer to query j
        //next[i] gives distance between this element and next less element
        stack = new Stack();
        int[] next = new int[N];
        for (int k = N-1; k >= 0; --k) {
            while (!stack.isEmpty() && A[k] < A[stack.peek()])
                stack.pop();
            next[k] = stack.isEmpty() ? A.length-k: stack.peek()-k;
            stack.push(k);
        }

        // Use prev/next array to count answer
        long ans = 0;
        for (int i = 0; i < N; ++i) {
            ans += ((long)prev[i] * (long)next[i] * A[i]) % MOD;
            ans %= MOD;
        }
        return (int) ans;
    }
}
