package com.github.kastkest.patterns.structural.proxy;

public class LabDoor implements Door {
    @Override
    public void open(String invalid) {
        System.out.println("Opening lab door");
    }

    @Override
    public void close() {
        System.out.println("Closing the lab door");
    }
}
