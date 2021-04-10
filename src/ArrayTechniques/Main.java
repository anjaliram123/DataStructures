package ArrayTechniques;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee("Jain","jones",123));
        emplist.add(new Employee("John","Doe",456));
        emplist.add(new Employee("rocky","raj",234));
        emplist.add(new Employee("Mary","smith",345));

        emplist.forEach(e->{
            System.out.println(e);
        });
        System.out.println("------------------------------------------------------------");
        //to add at a particular index
        emplist.add(2,new Employee("Joseph","marino",778));

        emplist.forEach(e->{
            System.out.println(e);
        });

    }
}
