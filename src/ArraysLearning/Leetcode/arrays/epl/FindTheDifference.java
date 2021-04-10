package ArraysLearning.Leetcode.arrays.epl;

public class FindTheDifference {

    public static void main(String[] args) {
        FindTheDifference f = new FindTheDifference();
        String s = "abcd";
        String t = "abcde";
        char c = f.findTheDifference(s,t);
        System.out.println(c);
    }
    public char findTheDifference(String s, String t) {
        char ch = 0;

        for(int i=0;i<s.length();i++) {
            ch = (char) (ch ^ s.charAt(i));
        }

        for(int j=0;j<t.length();j++) {
            ch = (char) (ch ^ t.charAt(j));
        }
        return ch;
    }
}
