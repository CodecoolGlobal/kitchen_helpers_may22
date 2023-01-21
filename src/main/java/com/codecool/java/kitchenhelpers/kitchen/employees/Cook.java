package com.codecool.java.kitchenhelpers.kitchen.employees;

import com.codecool.java.kitchenhelpers.kitchen.exceptions.NoKnifeException;

import java.util.Date;

public class Cook extends Cooking {

    public Cook(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
    }

    public void cook() throws NoKnifeException {
        if (getKnives().isEmpty()) {
            throw new NoKnifeException();
        } shout("I'm cooking!");
    }
}
