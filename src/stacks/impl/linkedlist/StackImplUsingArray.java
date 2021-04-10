package stacks.impl.linkedlist;

public class StackImplUsingArray {

    String s [];
    int N = 0;

    public static void main(String[] args) {
        StackImplUsingArray stk = new StackImplUsingArray();
        stk.s = new String[5];
        stk.push("Happy");
        stk.push("go");
        stk.push("lucky");
        while(!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        if(item != null) {
            s[N++] = item;
        }
    }

    public String pop() {
        String item = s[--N];
        s[N] = null;
        return item;
    }

}
