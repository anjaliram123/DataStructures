package ArraysLearning.Leetcode.thirtydaychallenge;

public class Linked{

    public Node root;

    public Linked() {
        this.root = null;
    }

    public Node MiddleNode(Node root) {
        if(root == null) {
            return null;
        }
        if(root.next == null) {
            return root;
        }
        Node curr = root;
        Node res = root;
        int count = 0;
        int middle = 0;
        while(curr!=null) {
            curr = curr.next;
            count = count+1;
        }

        if(count%2 != 0) {
            middle = count/2;
        } else {
            middle  = (count + 1)/2;
        }

        while(middle > 0 ) {
            middle--;
            res = res.next;
        }
        return res;
    }
}
