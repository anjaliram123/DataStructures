public class PermutationofString {

    public static void main(String[] args) {
        String s = "ABC";

        for(int i=0;i<s.length();i++) {
            String perm = s.charAt(i)+s.substring(0,i)+s.substring(i+1);
            System.out.println(perm);
        }
    }
}
