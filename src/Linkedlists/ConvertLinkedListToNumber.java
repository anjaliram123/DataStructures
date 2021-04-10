package Linkedlists;

import java.util.ArrayList;
import java.util.List;

public class ConvertLinkedListToNumber {

    public static void main(String[] args) {

        ConvertLinkedListToNumber cc = new ConvertLinkedListToNumber();
        Linkedlist2 l1 = new Linkedlist2();
        //[1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
        l1.head = new Node2(1);
        l1.head.next = new Node2(0);
        l1.head.next.next = new Node2(0);
        l1.head.next.next.next = new Node2(1);
        l1.head.next.next.next.next = new Node2(0);
        l1.head.next.next.next.next.next = new Node2(0);
        l1.head.next.next.next.next.next.next = new Node2(1);
        l1.head.next.next.next.next.next.next.next= new Node2(1);
        l1.head.next.next.next.next.next.next.next.next = new Node2(1);
        l1.head.next.next.next.next.next.next.next.next.next= new Node2(0);
        l1.head.next.next.next.next.next.next.next.next.next.next = new Node2(0);
        l1.head.next.next.next.next.next.next.next.next.next.next.next  = new Node2(0);
        l1.head.next.next.next.next.next.next.next.next.next.next.next.next= new Node2(0);
        l1.head.next.next.next.next.next.next.next.next.next.next.next.next.next= new Node2(0);
        l1.head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new Node2(0);



        int a = cc.getDecimalValue(l1.head);
        System.out.println(a);
    }

    private int getDecimalValue(Node2 head) {
        Node2 curr =  head;
        List<Integer> li = new ArrayList<>();
        while(curr != null) {
            li.add(curr.data);
            curr = curr.next;
        }
        int n = li.size() - 1;
        double sum = 0;
        for(int i=n; i>=0 ; i--) {
            sum = sum + (Math.pow(2,n-i)* li.get(i));
        }
      return (int)sum;
    }
}
