package ArraysLearning.Leetcode.arrays;

import javax.management.monitor.GaugeMonitor;

public class GameOfLife {

    //Game of Life

    public static void main(String[] args) {
        GameOfLife gl = new GameOfLife();
        int board[][] = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gl.gameOfLife(board);
    }

    public void gameOfLife(int[][] board) {
        //create a copy of board
        int[][] dummyBoard = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                dummyBoard[i][j] = board[i][j];
            }
        }


        for(int i=0; i<dummyBoard.length; i++) {
            for (int j = 0; j < dummyBoard[0].length; j++) {
                int currrow = i;
                int currcol = j;
                int leftsidecol = currcol - 1;
                int rightsidecol = currcol + 1;
                int rowAbove = currrow - 1;
                int rowBelow = currrow + 1;
                int sum = 0;
                //look for entire row - changing columns - leftside and rightside col and same row
                for(int k=leftsidecol; k<=rightsidecol && k<dummyBoard[0].length; k++){
                    if(k < 0 || k == currcol) {
                        continue;
                    }
                    sum = sum + dummyBoard[currrow][k];
                }


                //look for entire column - changing row -leftside and rightside rows and same col
                for(int l = rowAbove; l<=rowBelow && l<dummyBoard.length; l++) {
                    if(l < 0 || l == currrow ) {
                        continue;
                    }
                    sum = sum + dummyBoard[l][currcol];
                }

                //look for one row above and left side and right side col
                //col changes - row doesn't change

                if(rowAbove >= 0){
                    for(int k=leftsidecol; k<=rightsidecol && k<dummyBoard[0].length; k++){
                        if(k < 0 || k == currcol) {
                            continue;
                        }
                        sum = sum + dummyBoard[rowAbove][k];
                    }
                }


                //look for one row below and left side and rigth side col
                if(rowBelow <= dummyBoard.length -1)
                { for(int k=leftsidecol; k<=rightsidecol && k<dummyBoard[0].length; k++){
                        if(k < 0 || k == currcol) {
                            continue;
                        }
                        sum = sum + dummyBoard[rowBelow][k];
                    }
                }

                //check for conditions
                if(board[currrow][currcol] == 0) {
                    if(sum == 3) {
                        board[currrow][currcol] = 1;
                    }
                } else if(board[currrow][currcol] == 1) {
                    if(sum > 3) {
                        board[currrow][currcol] = 0;
                    }
                    else if(sum == 2 || sum == 3){
                        //do nothing
                    }
                    else if(sum < 2) {
                        board[currrow][currcol] = 0;
                    }
                }
            }
        }


        for(int i=0; i<board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
