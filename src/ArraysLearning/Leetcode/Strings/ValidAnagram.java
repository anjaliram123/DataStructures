package ArraysLearning.Leetcode.Strings;

public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean res = v.isAnagarm(s,t);
        System.out.println(res);
    }

    public boolean isAnagarm(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        int counter[] = new int[26];
        for(int i=0; i<s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++) {
            counter[t.charAt(i) - 'a']--;
            if(counter[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
