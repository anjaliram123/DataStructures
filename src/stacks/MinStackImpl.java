package stacks;

public class MinStackImpl {

    public static void main(String[] args) {
        /*MinStack m = new MinStack();
        m.push(2);
        m.push(0);
        m.push(3);
        m.push(0);
        int x = m.getMin();
        m.pop();
        int t = m.getMin();
        m.pop();
        int s = m.getMin();
        m.pop();
        int z = m.getMin();
        System.out.println(z);*/

       /* MinStackOptimized m = new MinStackOptimized();
        m.push(2);
        m.push(0);
        m.push(3);
        m.push(0);
        int x = m.getMin();
        m.pop();
        int t = m.getMin();
        m.pop();
        int s = m.getMin();
        m.pop();
        int z = m.getMin();
        System.out.println(z);*/


        MaxStack ms = new MaxStack();
        ms.push(5);
        ms.push(1);
        ms.push(5);
        int top = ms.top();
        System.out.println(top);
        System.out.println(ms.popMax());
        System.out.println(ms.top());
        System.out.println(ms.peekMax());
        System.out.println(ms.pop());
        System.out.println(ms.top());

    }
}
