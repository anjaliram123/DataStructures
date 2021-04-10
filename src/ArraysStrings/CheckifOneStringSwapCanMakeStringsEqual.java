package ArraysStrings;

import java.util.ArrayList;
import java.util.List;

public class CheckifOneStringSwapCanMakeStringsEqual {


    public static void main(String[] args) {
        CheckifOneStringSwapCanMakeStringsEqual c = new CheckifOneStringSwapCanMakeStringsEqual();
        String s1 = "caa";
        String s2 = "aaz";
        boolean res = c.areAlmostEqual(s1,s2);
        System.out.println(res);
    }

    public boolean areAlmostEqual(String s1, String s2) {
        int notEqualCount = 0;
        List<Integer> swapIndexList = new ArrayList<>();
        if(s1.length() != s2.length()) {
            return false;
        }

        for(int i=0;i <s1.length(); i++)  {
            if(s1.charAt(i) != s2.charAt(i)) {
                notEqualCount += 1;
                swapIndexList.add(i);
            }
        }

        if(notEqualCount == 0) {
            return true;
        }

        if(notEqualCount == 2) {
            String res = swap(swapIndexList.get(0), swapIndexList.get(1), s2);
            if(s1.equalsIgnoreCase(res)){
                return true;
            }
        }
        return false;
    }

    private String swap (int i , int j, String s2){
       StringBuilder sb = new StringBuilder(s2);
       sb.setCharAt(i, s2.charAt(j));
       sb.setCharAt(j, s2.charAt(i));
       return sb.toString();
    }
}
