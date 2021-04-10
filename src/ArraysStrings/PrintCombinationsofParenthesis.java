package ArraysStrings;

public class PrintCombinationsofParenthesis {

    public static void main(String[] args) {

        int n = 8;
        PrintCombinationsofParenthesis print = new PrintCombinationsofParenthesis();
        print.validParenthesis(n/2, n/2, "");
    }

    public void validParenthesis(int openP, int closeP, String s){
        if(openP == 0 && closeP == 0){
            System.out.println(s);
        }

        if(openP > closeP) {
            return;
        }

        if(openP > 0 ){
            validParenthesis(openP-1, closeP, s + "(");
        }

        if(closeP > 0 ){
            validParenthesis(openP, closeP-1, s + ")");
        }

    }
}
