package ArraysStrings;

public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence s = new IsSubsequence();
        s.isSubsequence("","ahbgdc");
    }

    public void isSubsequence(String s, String t) {

        String res = new String();
        int i = 0;
        int j = 0;
        while (i < t.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                res = res + t.charAt(i);
                i++;
                j++;
            } else {
                i++;
            }
        }
        System.out.println(res);
        System.out.println(s);
        if(s.equals(res)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
