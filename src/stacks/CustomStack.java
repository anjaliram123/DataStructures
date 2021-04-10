package stacks;

public class CustomStack {

    Integer arr[];
    int N = 0;
    public CustomStack(int maxSize) {
        arr = new Integer[maxSize];
    }

    public void push(int x) {
        if(N < arr.length) {
            arr[N] = x;
            N++;
        }
    }


    public int pop() {
        if(N != 0) {
            int val = arr[--N];
            arr[N] = null;
            return val;
        } else {
            return -1;
        }
    }

    public void increment(int k, int val) {
        if(N != 0) {
            if (N < k) {
                for (int i = 0; i < N; i++) {
                    arr[i] = arr[i] + val;
                }
            } else {
                int j = 0;
                while (j < k) {
                    arr[j] = arr[j] + val;
                    j++;
                }
            }
        }
    }
}
