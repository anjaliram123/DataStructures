package ArraysStrings;

import java.util.Arrays;
import java.util.HashSet;

public class GoatLatin {

    public static void main(String[] args) {
        GoatLatin gl = new GoatLatin();
       String res =  gl.toGoatLatin("I speak Goat Latin");
        System.out.println(res);
    }

    public String toGoatLatin(String S){
        if (S == null || S.length() == 0) {
            return "";
        }
        String ma = "ma";
        StringBuilder sb = new StringBuilder();
        StringBuilder suffix  = new StringBuilder("a");
        HashSet<Character> set = new HashSet<>( Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String [] words = S.split(" ");
        for(int i = 0;i<words.length;i++) {
            if (sb.length() != 0) {
                sb.append(" ");
            }

            char fcar = words[i].charAt(0);
            if (set.contains(fcar)) {
                sb.append(words[i]);
            } else {
                sb.append(words[i].substring(1));
                sb.append(fcar);
            }
            sb.append(ma).append(suffix);
            suffix.append("a");
        }

        return sb.toString();
    }
}
