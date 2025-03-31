package Composite;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuComponent{
    private String name;
    private List<MenuComponent> items;
    public MenuCategory(String name){
        items = new ArrayList<>();
    }

    public void addComponent(MenuComponent component){
        items.add(component);
    }
    @Override
    public void showInfo() {
        System.out.println("Category: " + name);
        for (MenuComponent item : items) {
            item.showInfo();
        }
    }
}
