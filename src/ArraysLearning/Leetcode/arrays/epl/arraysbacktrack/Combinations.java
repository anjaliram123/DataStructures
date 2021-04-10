package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Combinations {

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        int n = 10;
        int k = 2;
        List<List<Integer>> output = combinations.combine(n ,k);
        ListIterator<List<Integer>> itr = output.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        backtrack(1,n , k ,output, new ArrayList<>());
        return output;
    }

    public void backtrack(int start, int n , int k , List<List<Integer>> output, List<Integer> li) {
        if(li.size() == k) {
            output.add(new ArrayList<>(li));
            return;
        }

        //huge difference in runtime
        //for i <=n(very high - 20ms )and i <= n-(k-li.size())+1(very less - 1ms)
        //if we make i <= n - (k-li.size())+1 it wont iterate for last number that is 4 thus saving runtime
        for(int i=start; i<=n-(k-li.size())+1 ; i++) {
            li.add(i);
            backtrack(i+1, n , k ,output, li);
            li.remove(li.size() - 1);
        }
        return;
    }
}
