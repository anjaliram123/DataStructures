package ArraysLearning.Leetcode.thirtydaychallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class isHappy {

    public static void main(String[] args) {
        isHappy is = new isHappy();
        boolean res = is.isHappy(2);
        System.out.println(res);
    }

    public boolean isHappy(int n){
        Map<Integer, Integer> numlist = new HashMap<>();
        boolean res = isHappy(n, numlist);
        return res;
    }
    public boolean isHappy(int n,Map<Integer, Integer> numlist) {
        int sqaurenumber = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            sqaurenumber = sqaurenumber + (digit * digit);
        }
        if(!numlist.containsKey(sqaurenumber))
        {
            numlist.put(sqaurenumber,1);
        }else{
            return false;
        }
        if (sqaurenumber == 1) {
            return true;
        }
        return isHappy(sqaurenumber, numlist);
    }
}
