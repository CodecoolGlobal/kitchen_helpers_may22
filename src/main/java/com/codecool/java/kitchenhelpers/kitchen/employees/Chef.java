package com.codecool.java.kitchenhelpers.kitchen.employees;
import com.codecool.java.kitchenhelpers.kitchen.exceptions.NoKnifeException;
import com.codecool.java.kitchenhelpers.kitchen.exceptions.OutOfIngredientsException;
import com.codecool.java.kitchenhelpers.kitchen.helpers.KitchenService;
import com.codecool.java.kitchenhelpers.kitchen.stash.IngredientTypes;
import lombok.Setter;

import java.util.Date;
import java.util.Random;

public class Chef extends Cooking {
    @Setter
    KitchenService kitchenService;
    public Chef(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
        this.kitchenService = kitchenService;
    }

    public void cook() throws NoKnifeException {
        boolean isCooking = new Random().nextBoolean();
        if (getKnives().isEmpty()) {
            throw new NoKnifeException();
        }
        if (isCooking) {
            shout("I'm Chef and I'm cooking!");
        } else {
            requestIngredient(IngredientTypes.randomIngredient());
        }
    }
    public void requestIngredient(IngredientTypes ingredientTypes) {
        try {
            kitchenService.requestIngredient(ingredientTypes);
            shout("Thank you! (ingredient returned)");
        } catch (OutOfIngredientsException e) {
            shout("We're all out");
        }
    }
}
