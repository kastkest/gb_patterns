package com.github.kastkest.patterns.structural.composite;

public class Designer implements Employee{

    private Float salary;
    private String name;
    private String roles;

    public Designer(Float salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getRoles() {
        return roles;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
