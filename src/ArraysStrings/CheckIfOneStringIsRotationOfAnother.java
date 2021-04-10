package ArraysStrings;

public class CheckIfOneStringIsRotationOfAnother {


    public static void main(String[] args) {

        CheckIfOneStringIsRotationOfAnother c = new CheckIfOneStringIsRotationOfAnother();
        String s1 = "sumitjain";
        String s2 = "tjainsumi";

        boolean isRotated = c.isRotated(s1,s2);
        System.out.println("Is rotated - " +isRotated);
    }

    public boolean isRotated(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        String sadd = s1+s1;
        if(sadd.contains(s2)){
            return true;
        } else{
            return false;
        }
    }
}
