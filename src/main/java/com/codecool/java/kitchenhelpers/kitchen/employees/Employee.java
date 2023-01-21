package com.codecool.java.kitchenhelpers.kitchen.employees;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public abstract class Employee {
    private String name;
    private double salary;
    private Date birthDate;

    public double getTax() {
        return 0.99 * salary;
    }

    @Override
    public String toString() {
        return name + "Salary: " + salary + " Birth Date: " + birthDate;
    }
}
