package stacks;

public class DecodeString {

    public static void main(String[] args) {
        DecodeString d = new DecodeString();
        String res = d.decodeString("100[leetcode]");
        System.out.println("The decoded string is "+res);
    }

    public String decodeString(String s) {
        java.util.Stack<Character> st = new java.util.Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder();
                while(st.peek() != '['){
                    sb.append(st.pop());
                }
                //remove '['
                st.pop();
                //it should be the digit k now as we know the decodedString
                int base = 1;
                int k = 0;
               while(!st.isEmpty() && Character.isDigit(st.peek())) {
                   k = k + (st.pop()-'0') * base;
                   base = base*10;
               }
                StringBuilder sb2 = new StringBuilder();
                for(int j=0; j<k; j++) {
                    sb2.append(sb);
                }

                //push it in reverse order
                for(int x=sb2.length()-1;x>=0;x--) {
                    st.push(sb2.charAt(x));
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        char[] result = new char[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return new String(result);
    }
}
