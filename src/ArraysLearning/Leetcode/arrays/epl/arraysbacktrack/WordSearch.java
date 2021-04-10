package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class WordSearch {

    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char [] [] board = {{'A','B','C','E'},{'S','F','C','S'}, {'A','D','E','E'}};
        boolean res = ws.exist(board, "ABCCED");
        System.out.println("The word exists ? " +res);
    }

    public boolean exist(char[][] board, String word) {
        int rowLength = board.length;
        int colLength = board[0].length;
        for(int i=0;i<rowLength;i++) {
            for(int j=0;j<colLength;j++) {
                if(backtrack(i, j, rowLength, colLength, 0, word, board)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean backtrack(int row, int col, int rowLength, int colLength, int index, String word, char board[][]) {
        if(index >= word.length()) {
            return true;
        }
        //check boundary erros
        if(row < 0 || row >= rowLength || col < 0 || col >= colLength || board[row][col] != word.charAt(index)) {
            return false;
        }
        //mark current box as visites
        board[row][col] = '#';
        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};

        //check for all four sides of a particular row,colum
        for(int d=0; d<4; d++) {
            if(backtrack(row+rowOffsets[d], col+colOffsets[d], rowLength, colLength, index+1, word, board)) {
                return true;
            }
        }
        //backtrack
        board[row][col] = word.charAt(index);
        return false;
    }
}
