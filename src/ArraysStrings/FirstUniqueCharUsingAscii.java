package ArraysStrings;

public class FirstUniqueCharUsingAscii {

    public static void main(String[] args) {
        FirstUniqueCharUsingAscii f = new FirstUniqueCharUsingAscii();
        int index = f.firstUniqChar("loveleetcode");
        System.out.println(index);
    }

    public int firstUniqChar(String s){
        int temp[] = new int[256];
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
            char c = s.charAt(i);
            temp[s.charAt(i)] += 1;
        }
        for(int i = 0; i < s.length(); i++){
            if(temp[s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
