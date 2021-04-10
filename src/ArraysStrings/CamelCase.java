package ArraysStrings;

import com.sun.deploy.util.StringUtils;

public class CamelCase {

    public static void main(String[] args) {
        CamelCase camelCase = new CamelCase();
        int result = camelCase.numberOfWords("saveChangesInTheEditor");
        System.out.println(result);
    }

    public int numberOfWords(String s) {
        if(s.isEmpty() || s == null){
            return 0;
        }
        int value = 1;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                value = value+1;
            }
        }
        return value;
    }
}
