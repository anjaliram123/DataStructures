package ArraysStrings;

public class LengthofLastWord {

    public static void main(String[] args) {
        LengthofLastWord l = new LengthofLastWord();
        int length = l.lengthOfLastWord("Hello   ");
        System.out.println(length);
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        s= s.trim();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            if(s.charAt(i)==' '){
                break;
            }
        }
        return count;
    }
}
