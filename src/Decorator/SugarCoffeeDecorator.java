package Decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator{
    public SugarCoffeeDecorator(ICoffee coffee){
        super(coffee);
    }

    @Override
    public void prepare(){
        System.out.println("Adding sugar");
    }
}
