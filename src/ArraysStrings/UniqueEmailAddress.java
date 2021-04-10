package ArraysStrings;

import java.util.HashSet;

public class UniqueEmailAddress {

    public static void main(String[] args) {
        UniqueEmailAddress u = new UniqueEmailAddress();
        String [] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int value = u.unique(emails);
        System.out.println(value);
    }

    public int unique(String[] emails) {
        HashSet<String> stringset = new HashSet<>();
        if(emails==null){
            return 0;
        }
        for(int i=0; i<emails.length; i++) {
            String [] split = emails[i].split("@");
            char[] charArray = split[0].toCharArray();
            StringBuilder sb = new StringBuilder("");
            for(int j=0;j<charArray.length;j++) {
                if(charArray[j]=='+'){
                    break;
                }
                if(charArray[j]=='.'){
                    continue;
                }
                sb.append(charArray[j]);
            }
            sb.append("@"+split[1]);
            stringset.add(sb.toString());
        }
        return stringset.size();
    }
}
