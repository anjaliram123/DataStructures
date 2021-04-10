package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class LetterPossibilities {

    public static void main(String[] args) {
        LetterPossibilities lp = new LetterPossibilities();
        int res = lp.numTilePossibilities("AAB");
        System.out.println(res);
    }

    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            ++count[tiles.charAt(i) - 'A'];
        }
        return dfs(count);
    }

    private int dfs(int[] count) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                ++sum;
                --count[i];
                sum += dfs(count);
                ++count[i];
            }
        }
        return sum;
    }
}
