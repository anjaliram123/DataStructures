package ArraysStrings;

public class RepeatedStringMatch {

    public static void main(String[] args) {
        RepeatedStringMatch r = new RepeatedStringMatch();
        int val = r.repeatedStringMatch("abcd","cdabcdab");
        System.out.println(val);
    }

    public int repeatedStringMatch(String A, String B){
        StringBuilder sb = new StringBuilder(A);
        int min=1;
        while(sb.length() < B.length()){
                sb.append(A);
                min = min+1;
            }

        if(sb.indexOf(B) != -1){
            return min;
        }

        sb.append(A);
        return (sb.indexOf(B) == -1 ? -1:min+1);
    }
}
