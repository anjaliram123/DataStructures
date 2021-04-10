package ArraysStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumFrequencyDeletions {

    // Minimum Deletions to Make Character Frequencies Unique

    public static void main(String[] args) {
        MinimumFrequencyDeletions m = new MinimumFrequencyDeletions();
        String s = "ceabaacb";
        int deletions = m.minDeletions(s);
        System.out.println("Minimum deletions are "+deletions);
    }

    public int minDeletions(String s) {
        /*int [] freqArray = new int[26];
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            freqArray[c-'a']++;
        }
        Arrays.sort(freqArray);
        //lets put some expectations
        int expectation = freqArray[25];
        int res = 0;
        for(int i=25; i>=0; i--) {
            if(freqArray[i] == 0) {
                break;
            }
            if(freqArray[i] > expectation) {
                res = res + freqArray[i] - expectation;
            } else {
                expectation = freqArray[i];
            }
            if(expectation > 0) {
                expectation--;
            }
        }
        return res;*/
        int cnt[] = new int[26], res = 0;
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < s.length(); ++i)
            ++cnt[s.charAt(i) - 'a'];
        for (int i = 0; i < 26; ++i) {
            int freq = cnt[i];
            while (freq > 0 && !used.add(freq)) {
                --freq;
                ++res;
            }
        }
        return res;
    }
}
