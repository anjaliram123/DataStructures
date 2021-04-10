package ArraysStrings;

public class TwoStringsHackerRankMinimalSolution {

    public static void main(String[] args) {
        TwoStringsHackerRankMinimalSolution t = new TwoStringsHackerRankMinimalSolution();
        String finalString = t.twoStrings("hello", "world");
        System.out.println(finalString);
    }

    public String twoStrings(String s1, String s2) {
        for(char c='a'; c<='z'; c++) {
            if(s2.indexOf(c) > -1 && s1.indexOf(c) > -1){
                return "YES";
            }
        }
        return "NO";
    }
}
