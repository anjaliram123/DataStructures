package ArraysStrings;

public class StringCompressionUsingCountofrepeatedCharacters {

    public static void main(String[] args) {

        StringCompressionUsingCountofrepeatedCharacters comp = new StringCompressionUsingCountofrepeatedCharacters();
        String input = "ssssuuuummmmmmiiiittttttttttttt";
        String result = comp.getCompressed(input);
        System.out.println("The compressed string is " +result);
    }

    public String getCompressed(String input) {

        StringBuilder sb = new StringBuilder();
        int count =1;

        char prev = input.charAt(0);

        for(int i=1;i<input.length();i++){
            char curr = input.charAt(i);
            if(prev==curr){
                count ++;
            } else{
                sb.append(prev);
                sb.append(count);
                prev =curr;
                count =1;
            }
        }

        //for appending last character "t"
        sb.append(prev);
        sb.append(count);
        if(input.length()<sb.length()){
            return input;
        }else{
            return sb.toString();
        }

    }
}
