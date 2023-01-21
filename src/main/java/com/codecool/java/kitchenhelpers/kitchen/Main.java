package com.codecool.java.kitchenhelpers.kitchen;

import com.codecool.java.kitchenhelpers.kitchen.employees.Chef;
import com.codecool.java.kitchenhelpers.kitchen.employees.Cook;
import com.codecool.java.kitchenhelpers.kitchen.employees.KitchenHelper;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        kitchen.setChef(new Chef("Charlie", 3600, Date.from(Instant.now())));
        kitchen.addCook(new Cook("Anna", 3200, Date.from(Instant.now())));
        kitchen.addCook(new Cook("Anna2", 3200, Date.from(Instant.now())));
        kitchen.addCook(new Cook("Anna3", 3200, Date.from(Instant.now())));
        kitchen.addCook(new Cook("Anna4", 3200, Date.from(Instant.now())));
        kitchen.addCook(new Cook("Anna5", 3200, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("Staś", 2700, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("Staś2", 2700, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("Staś3", 2700, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("Staś4", 2700, Date.from(Instant.now())));
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
        kitchen.produceMeals();
    }
}
