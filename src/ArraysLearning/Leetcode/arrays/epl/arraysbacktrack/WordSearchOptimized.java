package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchOptimized {

    public static void main(String[] args) {
        WordSearchOptimized w = new WordSearchOptimized();
        char [] [] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'}, {'i','f','l','v'}};
        String [] words = {"oath","pea","eat","rain"};
        List<String> res = w.exist(board, words);
        for(String s : res) {
            System.out.println(s);
        }
    }

    public List<String> exist(char[][] board, String [] words) {
        boolean visited [] [] = new boolean[board.length][board[0].length];
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String s : words) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    visited[i][j] = false;
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(s.charAt(0) == board[i][j]) {
                        if (backtrack(board, i, j, visited, 0, s)) {
                            set.add(s);
                        }
                    }
                }
            }
        }

        for(String s : set) {
            res.add(s);
        }
        return res;
    }

    public boolean backtrack(char board[][], int i, int j, boolean visited[][], int index, String word) {
        if(board[i][j] == word.charAt(index)) {
            if(index == word.length()-1) {
                return true;
            }
            visited[i][j] = true;
            //up
            if(i > 0 && !visited[i-1][j] && backtrack(board, i-1, j, visited, index+1, word)) {
                return true;
            }
            //down
            if(i < board.length -1  && !visited[i+1][j] && backtrack(board, i+1, j, visited, index+1, word)) {
                return true;
            }
            //left
            if(j > 0 && !visited[i][j-1] && backtrack(board, i, j-1, visited, index+1, word)) {
                return true;
            }
            if(j < board[0].length-1 && !visited[i][j+1] && backtrack(board, i, j+1, visited, index+1, word)) {
                return true;
            }
            visited[i][j] = false;
        }
        return false;
    }
}
