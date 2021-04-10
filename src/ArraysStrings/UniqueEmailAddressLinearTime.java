package ArraysStrings;

import java.util.HashSet;

public class UniqueEmailAddressLinearTime {

    public static void main(String[] args) {
        UniqueEmailAddressLinearTime u = new UniqueEmailAddressLinearTime();
        String [] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int value = u.unique(emails);
        System.out.println(value);
    }

    public int unique(String[] emails) {
        HashSet<String> stringset = new HashSet<>();
        if (emails == null) {
            return 0;
        }
        for(int i=0;i<emails.length;i++){
            String[] split = emails[i].split("@");
            String [] local = split[0].split("\\+");
            stringset.add(local[0].replace(".","")+"@"+split[1]);
        }
        return stringset.size();
    }

}
