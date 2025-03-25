package Decorator;

public class MilkCoffeeDecorator extends CoffeeDecorator{
    public MilkCoffeeDecorator(ICoffee coffee){
        super(coffee);
    }

    @Override
    public void prepare(){
        System.out.println("Adding milk");
    }
}
