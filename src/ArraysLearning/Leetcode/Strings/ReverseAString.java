package ArraysLearning.Leetcode.Strings;

public class ReverseAString {

    public static void main(String[] args) {
        ReverseAString r = new ReverseAString();
        char [] s =  {'h','e','l','l','o'};
         r.reverse(s);
    }

    public void reverse(char [] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < s.length; k++) {
            System.out.println(s[k]);
        }
    }
}
