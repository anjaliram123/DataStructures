package ArraysStrings;

public class RepeatedSubStringPattern {

    public static void main(String[] args) {
        RepeatedSubStringPattern r = new RepeatedSubStringPattern();
        System.out.println(r.repeatedSubstringPattern("abaababaab"));//wont work for this
    }

    public boolean repeatedSubstringPattern(String s) {
        if(s==null || s.isEmpty()){
        return false;
    }
        if(s.length() < 2){
        return false;
    }
    char start = s.charAt(0);
    StringBuilder sb = new StringBuilder();
    StringBuilder res = new StringBuilder();
        sb.append(start);
        for(int i=1; i<s.length(); i++){
        if(start == s.charAt(i)){
            break;
        }
        sb.append(s.charAt(i));
    }

        while(s.length() > res.length()) {
        res.append(sb);
    }

        if(res.toString().equalsIgnoreCase(s)){
        return true;
    }
        return false;
}
}
