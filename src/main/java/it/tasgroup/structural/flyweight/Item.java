package it.tasgroup.structural.flyweight;

//L'instanza di Item sarà il nostro Flyweights
public class Item {

    private final String name;


    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
