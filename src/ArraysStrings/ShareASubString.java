package ArraysStrings;

public class ShareASubString {

    public static void main(String[] args) {
        ShareASubString s = new ShareASubString();
        s.shareASubString("hello","world");

    }

    public boolean shareASubString(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int n = 0;
        if(l1>l2){
            n = l2;
        } else {
            n = l1;
        }

        for(int i=0;i<=n-1;i++){
            String a = s1.substring(i,i+1);
            String b = s2.substring(i,i+1);
            if(a.equalsIgnoreCase(b)){
                return true;
            }
        }
        return false;
    }
}
