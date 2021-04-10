package ArraysLearning.Leetcode.GoldmanSachs;

import java.util.ArrayList;
import java.util.List;

public class HouseRobbing {
    static int v = 23;
    public int dd = 34;
    public static void main(String[] args) {
        HouseRobbing hr = new HouseRobbing();
        HouseRobbing hr2 = new HouseRobbing();

        System.out.println(hr.equals(hr2));
        int nums [] = {1,2,3,1};
        int maxAmount = 3;
        System.out.println("Max amount is "+maxAmount);

        int x = Integer.MAX_VALUE;
        byte b = (byte) x;
        long l = x;
        float ff = x;
        short s = (short) x;
        double dd = ff;
        System.out.println("hmmm");

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        List<Integer> res = hr.passbyval(li);

        System.out.println("Items in li");
        for(int i : li) {
            System.out.println(i);
        }

        System.out.println("Items in res");
        for(int j: res) {
            System.out.println(j);
        }
       //int xx =  hr.passbyval(v);
        //System.out.println(xx);
        System.out.println(v);

    }

    public List<Integer> passbyval (List<Integer> li ) {
        li.add(5);
        return li;
    }
}
