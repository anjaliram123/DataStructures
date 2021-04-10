package ArraysLearning.Leetcode.arrays.epl;

import java.math.BigInteger;

public class IncrementBinaryStrings {

    public static void main(String[] args) {
        IncrementBinaryStrings incrementBinaryStrings = new IncrementBinaryStrings();
        String s1 = "110";
        String s2 = "111";
       // String res = incrementBinaryStrings.addBinaryUisngAdditionOperator(s1,s2);
        String res1 = incrementBinaryStrings.addBinary(s1,s2);
        System.out.println(res1);
    }

    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }

    public String addBinaryUisngAdditionOperator(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
