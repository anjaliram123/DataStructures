package ArraysLearning.Leetcode.arrays.epl.strings;

public class RemoveDuplicatesInStringK {

    public static void main(String[] args) {
        RemoveDuplicatesInStringK r = new RemoveDuplicatesInStringK();
        String s = "yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy";
        String res = r.removeDuplicates(s, 4);
        System.out.println(res);
    }

    public String removeDuplicates(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        int [] count = new int[sb.length()];
        for(int i=0;i<sb.length();i++) {
            if(i==0 || (sb.charAt(i) != sb.charAt(i-1))) {
                count[i]=1;
            } else {
                count[i] = count[i-1] + 1;
                if(count[i] == k) {
                    sb.delete(i-k+1, i+1);
                    i=i-k;
                }
            }
        }

        return sb.toString();
    }
}
