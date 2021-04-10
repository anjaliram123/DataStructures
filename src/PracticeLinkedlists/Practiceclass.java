package PracticeLinkedlists;

public class Practiceclass {

     public Practiceclass()
    {
        System.out.println("Hi");
    }

    //Practiceclass cp=new Practiceclass();Results in stack over flow error since constructor recursive
    //call is made.

     //System.out.println("Hello");

    public static void main(String[] args) {
        Practiceclass p = new Practiceclass();

    }
}
