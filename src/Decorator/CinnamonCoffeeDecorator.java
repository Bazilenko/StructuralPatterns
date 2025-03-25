package Decorator;

public class CinnamonCoffeeDecorator extends CoffeeDecorator{
    public CinnamonCoffeeDecorator(ICoffee coffee){
        super(coffee);
    }

    @Override
    public void prepare(){
        System.out.println("Adding cinnamon");
    }

}
