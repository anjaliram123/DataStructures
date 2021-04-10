package ArraysLearning.Leetcode.arrays.epl.arraysbacktrack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {

    public static void main(String[] args) {
        RestoreIpAddress rp = new RestoreIpAddress();
        List<String> res = rp.restoreIpAddresses("25525511135");
        for(String s : res) {
            System.out.println(s);
        }
    }


    public List<String> restoreIpAddresses(String s)
    {
        List<String> res = new ArrayList<>();
        helper(res,new StringBuilder(),s,0,0);
        return res;
    }

        public void helper(List<String> res, StringBuilder temp, String s,int start, int count){
            if (start==s.length() && count==4) {
                res.add(temp.toString());
            } else if (count==4) return;

            for(int i=start; i<s.length(); i++){
                String curr = s.substring(start,i+1);
                int value = Integer.parseInt(curr);
                if (curr.length()>1 && curr.charAt(0)=='0') return;
                if (value>255) return;
                if (value<=255 && value>=0){
                    StringBuilder rollback = new StringBuilder(temp);
                    temp.append(s.substring(start,i+1));
                    if (count<3) temp.append(".");

                    helper(res,temp,s,i+1,count+1);
                    // Rollback to previous state
                    temp = rollback;
                }
            }
        }

    }
