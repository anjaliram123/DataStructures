public class PermutationsofaString {

   static  String s ="ABC";
    static char arr[] = s.toCharArray();

    public static void main(String[] args) {
        String str = "c";
        System.out.println(str.substring(0,0));
        perm(s,"");
        }

    public static void perm(String s1, String prefix) {
        if(s1.length() == 0){
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s1.length(); i++) {
                String perm = s1.substring(0, i) + s1.substring(i + 1);
                perm(perm, prefix + s1.charAt(i));// recursive call
            }
        }
    }
}
