package ArraysTutorialHorizon;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String s = "tutorialhorizon";
        RemoveDuplicatesFromString r= new RemoveDuplicatesFromString();
        String result = r.removeUsingBufferArray(s);
        System.out.println(result);

    }

    public String removeUsingBufferArray(String s){

        char [] charArray = s.toCharArray();
        boolean[] asci = new boolean[256];
        StringBuilder stb = new StringBuilder();
        for(int i=0;i<charArray.length;i++){
            if(asci[charArray[i]]){
                continue;
            }
            asci[charArray[i]]=true;
            stb.append(charArray[i]);
        }
        return stb.toString();
    }


}
