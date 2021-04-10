package FactoryPatternImplementation;

public class Factoryclass {


    public void gettypeofFood(String food)
    {
        if(food.equalsIgnoreCase("Pizza"))
        {
            Food f= new Pizzafood();
            f.getfood();
        }
        else if(food.equalsIgnoreCase("Burger")){
            Food f=new Burgerfood();
            f.getfood();
        }
        else
        {
            System.out.println("No food type available");
        }
    }
}
