package it.tasgroup.structural.bridge.shape2;

public class Shape2BridgeDemo {
    public static void main(String[] args) {

        //Questo esempio usa il bridge

        Color blue = new Blue();
        Shape square = new Square(blue); //Composition
        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();

        // con la stessa logica possiamo aggiungere nuove figure e colori
    }
}
