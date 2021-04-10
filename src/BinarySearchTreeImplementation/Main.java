package BinarySearchTreeImplementation;

public class Main {

    public static void main(String[] args) {
        Tree  t = new Tree();
        t.insert(3);
        t.insert(8);
        t.insert(1);
        t.insert(4);
        t.insert(6);
        t.insert(2);
        t.insert(10);
        t.insert(9);
        t.insert(20);t.insert(15);t.insert(16);
        t.inorder(t.root);
        System.out.println(t.find(52));
        System.out.println(t.find(20));
        //delete node with no children
        //t.delete(5);
        //t.inorder(t.root);
        //delete node with two children
        t.delete(2);
        t.inorder(t.root);


    }
}
