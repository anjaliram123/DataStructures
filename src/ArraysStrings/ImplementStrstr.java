package ArraysStrings;

public class ImplementStrstr {

    public static void main(String[] args) {
        ImplementStrstr i = new ImplementStrstr();
        int val = i.strStr("helloll", "");
        System.out.println(val);
    }

    public int strStr(String haystack, String needle) {
        int val = 0;
        if(needle==null || needle.isEmpty()){
            return 0;
        }
        if(!haystack.contains(needle)){
            return -1;
        } else {
            val = haystack.indexOf(needle);
        }
        return val;
    }
}
