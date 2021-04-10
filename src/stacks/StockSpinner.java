package stacks;

public class StockSpinner {

    public static void main(String[] args) {
        StockSpinner s = new StockSpinner();
        int T[] = {100,80,60,70,60,75,85};
        int res[] = s.next(T);
        for(int i :res) {
            System.out.println(i);
        }
    }

    public int[] next(int T[]) {
        int ans [] = new int[T.length];
        StackImpl<Integer> st = new StackImpl<>();
        StackImpl<Integer> prices = new StackImpl<>();
        for(int i=0;i<T.length;i++) {
            int val = 1;
            while (!st.isEmpty() && T[i]>=T[st.peek()]) {
                prices.push(st.pop());
                val = val+1;
            }
            while(!prices.isEmpty()) {
                st.push(prices.pop());
            }
            ans[i]=val;
            st.push(i);
        }
        return ans;
    }
}
