package ArraysStrings;

public class NumberOfSegmentsinaString {

    public static void main(String[] args) {
        NumberOfSegmentsinaString n = new NumberOfSegmentsinaString();
        System.out.println(n.countSegments(" ,  "));
    }

    public int countSegments(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        // we need s.trim() because s.split() doesnt take into consideration
        // of thw whitespace at the begining of string example " , "
        //according to question, it should return '1' non-emptyr charachter  ','
        //but here it returns two taking space also into consideration, therefore
        //we need to trim the string.
        s= s.trim();
        if(s.length() == 0){
           return 0;
        }
        String[] split = s.split("\\s+");
        return split.length;
    }
}
