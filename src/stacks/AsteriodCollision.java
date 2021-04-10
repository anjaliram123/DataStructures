package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class AsteriodCollision {

    public static void main(String[] args) {
        AsteriodCollision a = new AsteriodCollision();
        int [] asteroids = {-2,1,-1,-2};
        int [] output = a.asteroidCollision(asteroids);
        for(int i : output) {
            System.out.println(i);
        }
    }

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        boolean blows = false;
        for(int a : asteroids) {
            blows = false;
            while(!st.isEmpty() && st.peek() > 0 && a < 0 && !blows) {
                if( -a < st.peek()) {
                    //do nothing
                    blows = true;
                }
                else if (-a == st.peek()) {
                        blows = true;
                        st.pop();
                }
                else {
                    st.pop();
                }
            }
            if(!blows) {
                st.push(a);
            }
        }

        int op[] = new int[st.size()];
        int i = st.size()-1;
        for(int res :st) {
            op[i]= res;
            i--;
        }
        return op;
    }
}
