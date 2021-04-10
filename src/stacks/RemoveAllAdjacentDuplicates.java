package stacks;

public class RemoveAllAdjacentDuplicates {

    //this works to remove all  duplicates k times but doesnt return it in same order they are passed in input string - that means adjacent conecpt doesn't work
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicates rem = new RemoveAllAdjacentDuplicates();
        String s = "yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy";
        int k = 4;
        String res = rem.removeDuplicates(s,k);
        System.out.println("The result aftr removing adjacent duplicates is "+res);
    }

    public String removeDuplicates(String s, int k) {
        int count [] = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            count[c-'a']++;
        }

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int val = c -'a';
            if(count[val] >= k) {
                int j=1;
                while(j<=k) {
                    count[val]--;
                    j++;
                }
            } else if (count[val] == 0) {
                //do not do anything
            } else {
                while(count[val] != 0) {
                    sb.append(c);
                    count[val]--;
                }
            }
        }
        return sb.toString();
    }
}
