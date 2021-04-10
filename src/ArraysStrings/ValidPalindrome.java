package ArraysStrings;

//This chnages the original String
public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        boolean isPalindrome = vp.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome);
    }

    public boolean  isPalindrome(String s){
        if(s==null){
            return false;
        }
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        s= s.trim();
        s = s.replaceAll("[^A-Za-z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().equalsIgnoreCase(s);
    }
}
