package com.github.kastkest.patterns.structural.facade;

public class Facade {

    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerFacade computerFacade = new ComputerFacade(computer);

        computerFacade.turnOn();

        computerFacade.turnOff();
    }
}
