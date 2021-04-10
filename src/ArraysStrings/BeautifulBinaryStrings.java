package ArraysStrings;

public class BeautifulBinaryStrings {

    public static void main(String[] args) {
        BeautifulBinaryStrings cb = new BeautifulBinaryStrings();
        int res = cb.countBinarySubstrings("0101010");
        System.out.println(res);
    }

    public int countBinarySubstrings(String b) {
        if(!b.contains("010")){
            return 0;
        } else {
           int a = b.length();
           String res = b.replaceAll("010", "");
           int c = res.length();
           return (a-c)/3;

        }

    }


}
