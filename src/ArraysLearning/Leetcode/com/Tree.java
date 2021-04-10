package ArraysLearning.Leetcode.com;

import java.util.*;

public class Tree {

    Node root;

    public Tree() {
        this.root = null;
    }

    public void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data);
        preOrder(n.left);
        preOrder(n.right);
    }

    public void postOrder(Node n) {
        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.data);
    }

    public List<Integer> inOrder(Node n) {
        List<Integer> res = new ArrayList<>();
        helper(res, n);
        return res;
    }

    public void helper(List<Integer> res, Node n) {
        if (n == null) {
            return;
        }
        helper(res, n.left);
        res.add(n.data);
        helper(res, n.right);
    }

    public List<Integer> inOrderiterative(Node n) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack();
        Node curr = n;
        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.data);
            curr = curr.right;
        }
        return res;
    }

    public List<Integer> preOrderiterative(Node n) {
        List<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        Node curr = n;
        pushallLeft(q, curr);
        while (!q.isEmpty()) {
            Node r = q.poll();
            res.add(r.data);
            pushallLeft(q, r.right);
        }
        return res;
    }

    private void pushallLeft(Queue<Node> q, Node n) {
        while (n != null) {
            q.add(n);
            n = n.left;
        }
    }

    public List<Integer> preOrderiterativeUsingStack(Node n) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack();
        st.push(n);
        while (!st.isEmpty()) {
            Node curr = st.pop();
            res.add(curr.data);
            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }
        }
        return res;
    }

    public List<Integer> postOrderiterativeUsingStack(Node n) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> fst = new Stack();
        Stack<Node> sst = new Stack();

        Node root = n;
        if (root == null) {
            return null;
        }
        fst.push(root);
        while (!fst.isEmpty()) {
            Node curr = fst.pop();
            sst.push(curr);
            if (curr.left != null) {
                fst.push(curr.left);
            }
            if (curr.right != null) {
                fst.push(curr.right);
            }
        }
        while (!sst.isEmpty()) {
            Node cu = sst.pop();
            res.add(cu.data);
        }
        return res;
    }

    public int maxDepth(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            return 0;
        }
        int count = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0) {
                Node n = q.remove();
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
            count++;
        }
        return count;
    }

    public int maxDepth2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth2(root.left);
        int rightMax = maxDepth2(root.right);
        int max = Math.max(leftMax+1, rightMax+1);
        return max;
    }

    public int maxDepthUsingStack(Node root){
        if(root == null) {
            return 0;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);
            if(node.left != null) {
                stack.push(node.left);
                value.push(temp+1);
            }
            if(node.right != null) {
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
    }

    public List<List<Integer>> levelOrderTraversal(Node root) {
        ArrayList<List<Integer>> wraplist = new ArrayList<>();
        if(root==null) {
            return wraplist;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for(int i=0;i<levelNum;i++) {
                Node temp = queue.poll();
                sublist.add(temp.data);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }

    public List<List<Integer>> zigzaglevelOrderTraversal(Node root) {
        ArrayList<List<Integer>> wraplist = new ArrayList<>();
        if (root == null) {
            return wraplist;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean normalOrder = false;
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            LinkedList<Integer> sublist = new LinkedList<>();
            normalOrder = !normalOrder;
            for (int i = 0; i < levelNum; i++) {
                Node temp = queue.poll();
               if(normalOrder) {
                   sublist.add(temp.data);
               }else {
                   sublist.addFirst(temp.data);
               }
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }

    public int diameter(Node n) {
        return 0;
    }

}





















