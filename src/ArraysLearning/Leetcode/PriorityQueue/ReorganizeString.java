package ArraysLearning.Leetcode.PriorityQueue;

public class ReorganizeString {

    public static void main(String[] args) {
        ReorganizeString  re = new ReorganizeString();
        int a = 0;
        a = a << 1;
        System.out.println(a);
        String s = "aab";
        String res = re.reorganizeString(s);
        System.out.println("The rearranged string is "+res);
    }


    public String reorganizeString(String S) {
        int [] count = new int[26];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)-'a']++;
        }

        int maxCount = 0;
        int maxCountedLetter = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxCountedLetter = i;
            }
        }

        char carray[] = new char[S.length()];
        int idx = 0;
        while(count[maxCountedLetter] > 0){
            carray[idx] = (char) (maxCountedLetter + 'a');
            idx = idx + 2;
            count[maxCountedLetter]--;
        }

        for(int i=0; i<count.length; i++) {
            while(count[i] > 0){
                if(idx >= carray.length){
                    idx = 1;
                }
                carray[idx] = (char) (i + 'a');
                idx = idx + 2;
                count[i]--;
            }

        }

        return String.valueOf(carray);
    }

}
