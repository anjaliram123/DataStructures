package ArraysTutorialHorizon;

import java.util.Stack;

public class MaximumElementinaStack {

    public static void main(String[] args) {
        Stack<Integer> main = new Stack<>();
        main.push(5);
        main.push(7);
        main.push(7);
        main.push(6);
        main.push(11);
        MaximumElementinaStack m = new MaximumElementinaStack();
        m.getmax(main);
    }

    public void getmax(Stack<Integer> main){
        Stack<Integer> track = new Stack<>();
        int x = main.pop();
        int max = x;
        track.push(x);

        while(!main.isEmpty()){
            int element  = main.pop();
            if(element >= track.peek()){
                track.push(element);
                max = element;
            }
        }
        System.out.println(track.peek());
    }
}
