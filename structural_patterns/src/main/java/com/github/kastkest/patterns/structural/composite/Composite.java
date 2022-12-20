package com.github.kastkest.patterns.structural.composite;

public class Composite {

    public static void main(String[] args) {
        Employee employee1 = new Designer(1500f, "John");
        Employee employee2 = new Developer(2500f, "Mark");

        Organization organization = new Organization();
        organization.addEmployee(employee1);
        organization.addEmployee(employee2);

        System.out.println(organization.getNetSalaries());
    }
}
