package ArraysStrings;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
        AddBinary add = new AddBinary();
        String val = add.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(val);//wont work for values higher than long
    }

    public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        long vala = 0;
        long valb = 0;
        int powerVal = a.length()-1;
        for(int i=0;i<a.length();i++){
            int val  = Character.getNumericValue(a.charAt(i));
            vala = (long) (vala + Math.pow(2,powerVal)*val);
            powerVal --;
        }

        int powerValb = b.length()-1;
        for(int i=0;i<b.length();i++){
            int val = Character.getNumericValue(b.charAt(i));
            valb = (long) (valb + Math.pow(2,powerValb)*val);
            powerValb --;
        }

        long res = vala + valb;
        String binary = Long.toBinaryString(res);
        return null;
    }
}
