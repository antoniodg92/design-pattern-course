package it.tasgroup.structural.bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {

        //Esempio senza Bridge
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();
        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();

        // cosa succede se voglio aggiungere un altro Shape?





    }
}
