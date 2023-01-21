package com.codecool.java.kitchenhelpers.kitchen.employees;

import com.codecool.java.kitchenhelpers.kitchen.exceptions.NoKnifeException;
import com.codecool.java.kitchenhelpers.kitchen.stash.IngredientTypes;
import com.codecool.java.kitchenhelpers.kitchen.stash.Knife;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Cooking extends Employee {

    private List<Knife> knives;

    public Cooking(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
    }

    public void cook() throws NoKnifeException {
        if (knives.isEmpty()) {
            throw new NoKnifeException();
        }
        shout("I'm cooking!");
    }

    public void addKnife(Knife knife) {
        knives.add(knife);
    }

    public void shout(String message) {
        System.out.println(message);
    }

    public void requestIngredient(IngredientTypes ingredientTypes) {

    }
}
