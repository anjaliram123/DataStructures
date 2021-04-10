package ArraysStrings;

public class ReverseOnlyVowelsUsingTwoPointer {

    public static void main(String[] args) {
        ReverseOnlyVowelsUsingTwoPointer r = new ReverseOnlyVowelsUsingTwoPointer();
        String res = r.reverse("leetcode");
        System.out.println(res);
    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0, j=s.length()-1;i<=j;){
            if(!isVowel(s.charAt(i))){
                i++;
            }
            else if(!isVowel(s.charAt(j))){
                j--;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j--, s.charAt(i++));
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char a){
        if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u' ||
        a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            return true;
        }
        return false;
    }
}
