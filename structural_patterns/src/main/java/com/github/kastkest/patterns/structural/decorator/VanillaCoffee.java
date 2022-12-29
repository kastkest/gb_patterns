package com.github.kastkest.patterns.structural.decorator;

public class VanillaCoffee implements Coffee {

    private Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", vanilla";
    }
}
