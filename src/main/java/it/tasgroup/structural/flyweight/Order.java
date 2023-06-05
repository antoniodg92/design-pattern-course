package it.tasgroup.structural.flyweight;

//non utilizzato per il flyweight
public class Order {

    private final int orderNumer;
    private final Item item;

    public Order(int orderNumer, Item item) {
        this.orderNumer = orderNumer;
        this.item = item;
    }

    void processOrder() {
            System.out.println("Ordering " + item +" for order number " + orderNumer);
    }
}
