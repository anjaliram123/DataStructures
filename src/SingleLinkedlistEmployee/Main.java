package SingleLinkedlistEmployee;

public class Main {


    public static void main(String[] args) {

       EmployeeLinkedlist emplist = new EmployeeLinkedlist();

       emplist.head=new EmployeeNode(new Employee("roshan","manir",123));

       EmployeeNode n1=new EmployeeNode(new Employee("jakir","hussain",234));

        EmployeeNode n2=new EmployeeNode(new Employee("akhil","akkineni",345));

        emplist.head.next=n1;
        n1.next=n2;
        n2.next=null;

        emplist.print();

        System.out.println("Adding new Employee to front of list-------------------");
        EmployeeNode n3=new EmployeeNode(new Employee("rameshwar","periythambi",377));
        emplist.addtoFront(n3);
        emplist.print();

        System.out.println("Adding new Employee to end of list-------------------");
        EmployeeNode n4=new EmployeeNode(new Employee("kapoor","shah",677));
        emplist.addtoLast(n4);
        emplist.print();


        System.out.println("Adding in middle of list----------------");
        EmployeeNode n5=new EmployeeNode(new Employee("rishi","bhat",647));
        emplist.addtomiddle(n3,n5);
        emplist.print();





    }
}
