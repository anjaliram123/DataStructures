package Linkedlists;

import java.util.ArrayList;
import java.util.List;

public class SumofLinkedList {

   public Node head;

    public SumofLinkedList() {
    }

    public void printNodes() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data);
            System.out.print("->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public int addNodes() {
        Node curr = head;
        int sum = 0;
        int i = 1;
        int mul = 0;
        while(curr!=null) {
            mul = i*(curr.data);
            sum = sum+mul;
            i=i*10;
            curr=curr.next;
        }
        return sum;
    }

    public List<Integer> getNumbersFromsum(int sum) {
        ArrayList<Integer> li = new ArrayList<>();
        int a = (sum/100);
        li.add(a);
        int b = (sum%100)/(10);
        li.add(b);
        int c = (sum%100)%(10);
        li.add(c);
        return li;
    }

}
