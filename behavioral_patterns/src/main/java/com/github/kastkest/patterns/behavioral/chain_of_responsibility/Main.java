package com.github.kastkest.patterns.behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Handler handler = new BusyHandler();
        handler.link(new Operator("#1"))
                .link(new Operator("#2"))
                .link(new Operator("#3"))
                .link(handler);

        for (int i = 0;i<10;i++) {
            final int temp = i;
            handler.handle(new Request() {
                @Override
                public String getData() {
                    return Integer.toString(temp);
                }
            });
        }
    }
}
