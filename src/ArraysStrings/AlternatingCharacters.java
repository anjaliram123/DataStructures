package ArraysStrings;

public class AlternatingCharacters {

    public static void main(String[] args) {
        AlternatingCharacters a = new AlternatingCharacters();
        int deletions = a.alternatingCharacters("AAA");
        System.out.println(deletions);
    }

    public int alternatingCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        int deletion = 0;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                sb.append(s.charAt(i));
            } else{
                deletion++;
            }
        }
        return deletion;
    }
}
