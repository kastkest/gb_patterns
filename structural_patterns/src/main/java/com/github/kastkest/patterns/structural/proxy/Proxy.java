package com.github.kastkest.patterns.structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        Door door = new SecuredDoor(new LabDoor());
        door.open("Invalid");
        door.open("$ecr@t");
        door.close();
    }
}
