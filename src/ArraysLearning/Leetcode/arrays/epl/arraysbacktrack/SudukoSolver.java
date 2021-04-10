package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

public class SudukoSolver {

    public static void main(String[] args) {
        SudukoSolver solver = new SudukoSolver();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
       board = solver.solveSudoku(board);
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public char[][] solveSudoku(char[][] board) {
        backtrack(board);
        return board;
    }

    public boolean backtrack(char[][]board) {
        for(int row=0; row<board.length;row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, row, col, c)) {
                            board[row][col] = c;
                            if(backtrack(board)){
                                return true;
                            }else {
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char board[][], int row, int col, char number) {
        for(int i=0;i<9;i++) {
            if(board[row][i] == number) {
                return false;
            }
            if(board[i][col] == number) {
                return false;
            }
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == number) {
                return false;
            }
        }
        return true;
    }
}
