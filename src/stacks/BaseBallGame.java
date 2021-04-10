package stacks;

public class BaseBallGame {
//Time complexity is O(N)
// space complexity is O(N)

    public static void main(String[] args) {
        BaseBallGame b = new BaseBallGame();
        String a [] = {"5","2","C","D","+"};
        int sum = b.calPoints(a);
        System.out.println(sum);
    }

    public int calPoints(String[] ops) {
        StackImpl<Integer> st = new StackImpl();
        int sum = 0;
        for (String op : ops) {
            if (op.equals("+")) {
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
                sum = sum + newtop;
            } else if (op.equals("C")) {
                int val = st.pop();
                sum = sum - val;
            } else if (op.equals("D")) {
                int val = st.peek();
                int res = val * 2;
                st.push(res);
                sum = sum + res;
            } else {
                st.push(Integer.valueOf(op));
                sum = sum + Integer.parseInt(op);
            }
        }
        return sum;
    }
    }
