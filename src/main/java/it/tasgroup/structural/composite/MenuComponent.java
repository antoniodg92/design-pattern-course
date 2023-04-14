package it.tasgroup.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {  //l'inizio della gerarchia

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(": ");
        stringBuilder.append(url);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
