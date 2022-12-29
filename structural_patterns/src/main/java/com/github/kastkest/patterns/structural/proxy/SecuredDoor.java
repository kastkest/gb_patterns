package com.github.kastkest.patterns.structural.proxy;

public class SecuredDoor implements Door {

    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open(String password) {
        if (this.authenticate(password)) {
            door.open("Invalid");
        }
        else {
            System.out.println("Big no! It ain't possible.");
        }
    }


    public Boolean authenticate(String password)
    {
        return password == "$ecr@t";
    }

    @Override
    public void close() {
        door.close();
    }
}
