package com.github.kastkest.patterns.behavioral.chain_of_responsibility;

public class Operator extends Handler {

    private String name;
    private final double probability = 0.9;

    public Operator() {
    }

    public Operator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handle(Request request) {
        if (isBusy()) {
            System.out.printf("Оператор %s занят\n", name);
            super.handle(request);
        } else {
            System.out.printf("Оператор %s обрабатывает Request %s\n", name, request.getData());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    @Override
    Handler link(Handler next) {
        return super.link(next);
    }
}
