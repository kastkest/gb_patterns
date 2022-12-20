package com.github.kastkest.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Float getNetSalaries() {
        float netSalary = 0.0f;
        for (Employee employee : employees) {
            netSalary += employee.getSalary();
        }
        return netSalary;
    }

}
