package ArraysLearning.Leetcode.arrays.epl.strings;

public class RemoveParanthesis {

    public static void main(String[] args) {
        RemoveParanthesis r = new RemoveParanthesis();
        String s = r.minRemoveToMakeValid("))((");
        System.out.println(s);
    }
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int openSeen = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openSeen++;
                balance++;
            }
            if (c == ')') {
                if (balance == 0) continue;
                balance--;
            }
            sb.append(c);
        }

        // Parse 2: Remove the rightmost "("
        StringBuilder result = new StringBuilder();
        int openToKeep = openSeen - balance;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                openToKeep--;
                if (openToKeep < 0) continue;
            }
            result.append(c);
        }

        return result.toString();
    }
}
