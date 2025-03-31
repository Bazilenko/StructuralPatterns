package Composite;

public class MenuItem implements MenuComponent{
    private String name;
    private double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public void showInfo(){
        System.out.println("Dish: " + name + " price: " + price);
    }
}
