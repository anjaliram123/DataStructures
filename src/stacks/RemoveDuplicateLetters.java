package stacks;

import java.util.*;

public class RemoveDuplicateLetters {

    public static void main(String[] args) {
        RemoveDuplicateLetters rd = new RemoveDuplicateLetters();
        String res = rd.removeDuplicateLettersMethod2("cdadabcc");
        System.out.println("method 2 answer is "+res);
        String res1 = rd.removeDuplicateLetters("cdadabcc");
        System.out.println("method 1 answer is"+res1);

    }

    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Stack<Character> st = new Stack<>();

        //set is  maintained to avoid duplicates ex- cbacdcbc
        HashSet<Character> set = new HashSet<>();
        int k = 0;

        //map is maintained with index as value to check for current index value is less than duplicated element index ex- cdadabcc
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), i);
        }

        for(int i=0;i<s.length();i++) {
            if(!set.contains(s.charAt(i))) {
                while (!st.isEmpty() && s.charAt(i) < st.peek() && map.get(st.peek()) > i) {
                    //map.get(st.peek())>i means remove element from Stack only if the index is greater than current element index ex- cdadbcc
                    set.remove(st.pop());
                }
                set.add(s.charAt(i));
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public String removeDuplicateLettersMethod2(String s) {
        int count[] = new int[26];
        for(char c  : s.toCharArray()) {
            count[c-'a']++;
        }
        boolean visited[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            int index  = c-'a';
            count[index]--;
            if(visited[index]) {
                continue;
            }
            while(!st.isEmpty() && st.peek() > c && count[st.peek()-'a'] != 0) {
                visited[st.pop()-'a']=false;
            }
            st.push(c);
            visited[index] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}
