package Decorator;

public abstract class CoffeeDecorator implements ICoffee{
    protected ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee){
            this.coffee = coffee;
    }

    public void prepare(){
        coffee.prepare();
    }
}
