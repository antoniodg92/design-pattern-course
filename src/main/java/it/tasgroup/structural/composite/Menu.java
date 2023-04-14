package it.tasgroup.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent{

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));

        Iterator<MenuComponent> itr = menuComponents.iterator();
        while (itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }
}
