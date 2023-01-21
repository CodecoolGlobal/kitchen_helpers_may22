package com.codecool.java.kitchenhelpers.kitchen;

import com.codecool.java.kitchenhelpers.kitchen.employees.Chef;
import com.codecool.java.kitchenhelpers.kitchen.employees.Cook;
import com.codecool.java.kitchenhelpers.kitchen.employees.Cooking;
import com.codecool.java.kitchenhelpers.kitchen.employees.KitchenHelper;
import com.codecool.java.kitchenhelpers.kitchen.exceptions.NoKnifeException;
import com.codecool.java.kitchenhelpers.kitchen.helpers.KitchenService;
import com.codecool.java.kitchenhelpers.kitchen.stash.Knife;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Kitchen {
    private final KitchenService kitchenService = new KitchenService();

    public void setChef(Chef chef) {
        this.chef = chef;
        chef.setKitchenService(kitchenService);
    }

    private Chef chef;
    private final List<Cook> cooks = new ArrayList<>();
    private final List<KitchenHelper> kitchenHelpers = new ArrayList<>();
    public void produceMeals() {
        if (Objects.isNull(chef)) {
            throw new RuntimeException("Nie można gotować. Zwijamy kuchnię!");

        }
        List<Cooking> cookingPeople = new ArrayList<>(cooks);
        cookingPeople.add(chef);

        cookingPeople.forEach(person -> {
            try {
                person.cook();
            } catch (NoKnifeException e) {
                person.addKnife(new Knife());
                System.out.println("Nóż otrzymany.");
            }
        });
    }
    public void addKitchenHelpers(KitchenHelper helper) {
        kitchenService.addHelper(helper);
        kitchenHelpers.add(helper);
    }
    public void addCook(Cook cook) {
        cooks.add(cook);
    }
}
