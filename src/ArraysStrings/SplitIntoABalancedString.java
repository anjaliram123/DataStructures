package ArraysStrings;

public class SplitIntoABalancedString {

    public static void main(String[] args) {
        SplitIntoABalancedString sp = new SplitIntoABalancedString();
        int sub = sp.balancedStringSplit("RLRRLLRLRL");
        System.out.println(sub);
    }

    public int balancedStringSplit(String s) {
        int Lnumber = 0;
        int splitted = 0;
        for(int j=s.length()-1 ; j>=0; j--){
            if(s.charAt(j)=='L')
            {
                Lnumber = Lnumber + 1;
            } else {
                Lnumber = Lnumber - 1;
            }
            if(Lnumber == 0){
                splitted = splitted + 1;
            }
        }
        return splitted;
    }


}
