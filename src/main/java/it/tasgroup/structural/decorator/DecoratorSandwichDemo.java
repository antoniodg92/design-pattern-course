package it.tasgroup.structural.decorator;

import java.io.IOException;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator((new SimpleSandwich())));

        System.out.println(sandwich.make());

    }
}
