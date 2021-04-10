package ArraysStrings;

import java.util.Arrays;

public class FindWordsFromedByCharacters {

    public static void main(String[] args) {
        FindWordsFromedByCharacters f = new FindWordsFromedByCharacters();
        String words[] = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int length = f.countCharacters(words, chars);
        System.out.println(length);
    }


    public int countCharacters(String[] words, String chars) {

        int count = 0;
        int[] seen = new int[26];
        //Count char of Chars String
        for (char c : chars.toCharArray())
            seen[c - 'a']++;
        // Comparing each word in words
        for (String word : words) {
            // simple making copy of seen arr
            int[] tSeen = Arrays.copyOf(seen, seen.length);
            int Tcount = 0;
            for (char c : word.toCharArray()) {
                if (tSeen[c - 'a'] > 0) {
                    tSeen[c - 'a']--;
                    Tcount++;
                }
                else
                    break;
            }
            if (Tcount == word.length())
                count += Tcount;
        }
        return count;
    }
}
