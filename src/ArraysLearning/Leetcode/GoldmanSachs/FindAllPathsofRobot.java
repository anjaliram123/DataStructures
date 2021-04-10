package ArraysLearning.Leetcode.GoldmanSachs;

import java.util.ArrayList;

public class FindAllPathsofRobot {

    public static void main(String[] args) {
        FindAllPathsofRobot f = new FindAllPathsofRobot();
        int [][] obs = {{0,0,0}, {0,1,0}, {0,0,0}};
        f.getPaths(obs);
    }

    public ArrayList<Point> getPaths(int[][] maze) {
        if(maze == null || maze.length == 0) {
            return null;
        }

        return null;

    }





}
