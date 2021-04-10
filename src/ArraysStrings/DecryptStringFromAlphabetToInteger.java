package ArraysStrings;

import java.util.HashMap;

public class DecryptStringFromAlphabetToInteger {

    public static void main(String[] args) {
        DecryptStringFromAlphabetToInteger d = new  DecryptStringFromAlphabetToInteger();
        HashMap<Integer, String> maps = new HashMap<>();
        String r = d.decryptfromfront("10#11#12");
        System.out.println(r);
    }

    public String decrypt(String s){
        //char [] c = s.toCharArray();
        int i = s.length()-1;
        StringBuilder res = new StringBuilder("");
        while(i>=0){
            if(s.charAt(i)=='#'){
                res.append((char)(97+ (s.charAt(i-1)-'0') +(s.charAt(i-2)-'0')* 10 - 1));
                i=i-2;
            }
           else {
                res.append((char)(97+ s.charAt(i)-'0'-1));
                i--;
            }
        }
        return res.reverse().toString();
    }

    public String decryptfromfront(String s) {
        int n = s.length();
        String ans = "";
        for(int i=0; i<n;){
            if(i<n-2 && s.charAt(i+2)=='#'){
                int val = Integer.parseInt(s.substring(i,i+2));
                ans += (char)(96+val);
                i = i+3;
            }
            else {
                int val2 = Integer.parseInt(s.substring(i,i+1));
                ans += (char)(96+val2);
                System.out.println(s.charAt(i)-'1');
                i++;
            }
        }
        return ans;
    }
}
