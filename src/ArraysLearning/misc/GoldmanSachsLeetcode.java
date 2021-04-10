package ArraysLearning.misc;

public class GoldmanSachsLeetcode {

    public static void main(String[] args) {
        GoldmanSachsLeetcode g = new GoldmanSachsLeetcode();
        boolean res = g.judgeCircle("UD");
        System.out.println("Return to origin " +res);
    }

    public boolean judgeCircle(String moves) {
        if(moves == null || moves.isEmpty()) {
            return false;
        }
        char [] carray = moves.toCharArray();
        int x = 0; int y = 0;
        for(int i = 0; i<carray.length ; i++) {
            char c = carray[i];
            switch(c) {
                case 'U' :
                y = y+1;
                break;
                case 'D' :
                y = y-1;
                    break;
                case 'L':
                x = x-1;
                    break;
                case 'R':
                x = x+1;
                    break;

            }
        }

        return  x == 0 && y == 0;
    }
}
