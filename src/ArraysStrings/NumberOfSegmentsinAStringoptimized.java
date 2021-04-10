package ArraysStrings;

public class NumberOfSegmentsinAStringoptimized {
    public static void main(String[] args) {
        NumberOfSegmentsinAStringoptimized n = new NumberOfSegmentsinAStringoptimized();
        System.out.println(n.countSegments("Hello, my name is John"));
    }

    public int countSegments(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int segmentCount = 0;
        for(int i=0;i<s.length();i++){
            if((i==0 || s.charAt(i-1)== ' ') && s.charAt(i) != ' '){
                segmentCount++;
            }
        }
        return segmentCount;
    }




}
