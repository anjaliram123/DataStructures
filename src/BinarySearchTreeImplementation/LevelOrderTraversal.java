package BinarySearchTreeImplementation;

public class LevelOrderTraversal {

    public static void main(String[] args) {
        LevelOrderTraversal l = new LevelOrderTraversal();
        Tree  t = new Tree();
        t.insert(3);
        t.insert(8);
        t.insert(1);
        t.insert(4);
        t.insert(6);
        t.insert(2);
        t.insert(10);
        t.insert(9);
        int height = l.getHeight(t.root);

        for(int i=1;i<=height;i++) {
            l.printLevelOrder(t.root, i);
        }


        System.out.println(height);
    }

    public int getHeight(Node root) {
        Node curr = root;
        if(curr == null) {
            return 0;
        } else {
            int lheight =  getHeight(curr.left);
            int rheight = getHeight(curr.right);

            if(lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
        }
    }

    public void printLevelOrder(Node root, int h) {
        Node curr = root;
        if(curr == null) {
            return;
        } else if( h == 1 ) {
            System.out.println(root.data);
        } else if( h> 1){
            printLevelOrder(root.left,h-1);
            printLevelOrder(root.right, h-1);
        }
     }






}
