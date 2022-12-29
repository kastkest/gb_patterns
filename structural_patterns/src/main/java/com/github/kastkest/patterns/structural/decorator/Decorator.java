package com.github.kastkest.patterns.structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        Coffee someCoffee = new SimpleCoffee();
        System.out.println(someCoffee.getDescription());
        System.out.println(someCoffee.getCost());

        someCoffee = new MilkCoffee(someCoffee);
        System.out.println(someCoffee.getDescription());
        System.out.println(someCoffee.getCost());

        someCoffee = new WhipCoffee(someCoffee);
        System.out.println(someCoffee.getDescription());
        System.out.println(someCoffee.getCost());

        someCoffee = new VanillaCoffee(someCoffee);
        System.out.println(someCoffee.getDescription());
        System.out.println(someCoffee.getCost());
    }
}
