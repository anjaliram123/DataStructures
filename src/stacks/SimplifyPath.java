package stacks;

import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        String s = "/home//foo/";
        String simpliefiedPath = simplifyPath.simplifyPath(s);
        System.out.println("The simplified path is "+simpliefiedPath);
    }

    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String splittedPath[] = path.split("/");
        for(String s : splittedPath) {
            if(s.equalsIgnoreCase(".") || s.isEmpty()) {
                continue;
            }
            else if (s.equalsIgnoreCase("..")){
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        //we can interate over stack from bottom to top but if we use Deque as stack it iterates from top to bottom (which is not valid for us in this case)
        for(String s : st){
            sb.append("/").append(s);
        }

        return sb.length() >0 ? sb.toString() : "/";
    }
}
