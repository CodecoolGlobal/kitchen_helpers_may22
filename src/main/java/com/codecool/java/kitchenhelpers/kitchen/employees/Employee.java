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

    public void printTax() {
        System.out.println(salary * 0.99);
    }
}
