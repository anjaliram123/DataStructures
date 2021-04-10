package ArraysLearning.Leetcode.arrays.epl.strings;

public class MinAddTomakeValidPara2 {

    public static void main(String[] args) {
        MinAddTomakeValidPara2 m = new MinAddTomakeValidPara2();
        String s =  "(()))";
        int res = m.minAddToMakeValid(s);
        System.out.println(res);
    }

    public int minAddToMakeValid(String s) {
        boolean skip  = false;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(skip) { //the skip is used to skip the second ")" in case of "))"
                skip = false;
                continue;
            }
            char c = s.charAt(i);
            if(c == '(') {
                sb.append(c);
            }
            else if(c == ')' && i!=s.length()-1 && s.charAt(i+1) == ')') {
                if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    count++;
                }
                skip=true;//skip next iteration here as we do not want next iteration for second ")" in "))"
            }
           else if(c == ')' && i!=s.length()-1 ) {
               //this case for examples strings like
                //"()()()()()("
                if(sb.length() == 0) {
                    count++;
                    //here we are couting ")" and "(" so count will be two
                    //for example if we have no "(" left and we have one ")" we need to add one brakcet to right and and one to left to make it valid
                    //for example if we have one ")" add two brackets so it becomes "())" - which is valid.
                }
                else if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                count++;
                skip = false;
            }

           else if(c == ')' && i==s.length()-1 ) {
               //this case is for strings like "(()))"
                if(sb.length() == 0) {
                    count++;
                    //here we are couting ")" and "(" so count will be two
                    //for example if we have no "(" left and we have one ")" we need to add one brakcet to right and and one to left to make it valid
                    //for example if we have one ")" add two brackets so it becomes "())" - which is valid.
                }
                else if(sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                count++;
                skip = false;
            }
        }

        int j = sb.length()-1;
        while(sb.length() != 0) {
            //this is the case where "((" are left we need "))))" 4 of them to be valid , so we are adding 2 "))" for every "("
            sb.deleteCharAt(j);
            j--;
            count = count + 2;
        }

        return count;

    }
}
