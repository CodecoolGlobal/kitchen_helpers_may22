package com.codecool.java.kitchenhelpers.kitchen.employees;

import com.codecool.java.kitchenhelpers.kitchen.exceptions.NoKnifeException;
import com.codecool.java.kitchenhelpers.kitchen.stash.IngredientTypes;
import com.codecool.java.kitchenhelpers.kitchen.stash.Knife;
import lombok.Getter;

import java.util.*;

public abstract class Cooking extends Employee {

    @Getter
    private List<Knife> knives = new ArrayList<>();

    public Cooking(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
    }

    public abstract void cook() throws NoKnifeException;

    public void addKnife(Knife knife) {
        knives.add(knife);
    }

    public void shout(String message) {
        System.out.println(message);
    }
}
