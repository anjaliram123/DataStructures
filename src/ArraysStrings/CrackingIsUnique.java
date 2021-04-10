package ArraysStrings;

public class CrackingIsUnique {

    public static void main(String[] args) {
        CrackingIsUnique c = new CrackingIsUnique();
        boolean res = c.isUnique("abbd");
        System.out.println(res);
    }

    public boolean isUnique(String s){
        int head = 0;
        int tail = s.length()-1;
        while(head<=tail){
            if(s.charAt(head) == s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }


}
