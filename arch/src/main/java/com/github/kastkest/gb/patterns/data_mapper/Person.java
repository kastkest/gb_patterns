package com.github.kastkest.gb.patterns.data_mapper;

public class Person {

    private int idPerson;
    private String lastName;
    private String firstName;

    public void setIdPerson(int anInt) {
        this.idPerson = anInt;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
