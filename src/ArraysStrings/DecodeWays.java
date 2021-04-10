package ArraysStrings;

import java.util.HashMap;

public class DecodeWays {

    HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        DecodeWays d = new DecodeWays();
        String s = "2326";
        int ways = d.numDecodings(s);
        System.out.println("No.of ways is"+ways);
    }

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        return recursiveWithMemo(0, s);
    }

    public int recursiveWithMemo(int index, String str) {

        // If you reach the end of the string
        // Return 1 for success.
        if (index == str.length()) {
            return 1;
        }

        // If the string starts with a zero, it can't be decoded
        if (str.charAt(index) == '0') {
            return 0;
        }

        if (index == str.length()-1) {
            return 1;
        }

        // Memoization is needed since we might encounter the same sub-string.
        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        int ans = recursiveWithMemo(index+1, str);
        if (Integer.parseInt(str.substring(index, index+2)) <= 26) {
            ans += recursiveWithMemo(index+2, str);
        }

        // Save for memoization
        memo.put(index, ans);

        return ans;

    }
}
