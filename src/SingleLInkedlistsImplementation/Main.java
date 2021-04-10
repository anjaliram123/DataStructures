package SingleLInkedlistsImplementation;

public class Main {

    public static void main(String[] args) {

        SingleLL s1 = new SingleLL();

        s1.head=new Node(32);
        Node n1=new Node(56);
        Node n2=new Node(78);

        s1.head.next=n1;
        n1.next=n2;
        n2.next=null;

        s1.printlist();
    }
}
