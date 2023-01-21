package com.codecool.java.kitchenhelpers.kitchen.employees;

import com.codecool.java.kitchenhelpers.kitchen.stash.IngredientTypes;
import lombok.Getter;

import java.util.*;

@Getter
public class KitchenHelper extends Employee{
    private final Map<IngredientTypes, Integer> ingredients;


    public KitchenHelper(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
        ingredients = new EnumMap<>(IngredientTypes.class);
        randomizeIngredients();
    }

    private void randomizeIngredients() {
        Arrays.stream(IngredientTypes.values()).toList().forEach(ingredientTypes -> {
            ingredients.put(ingredientTypes, new Random().nextInt(0,4));
        });
    }

    public Optional<IngredientTypes> giveIngredient(IngredientTypes ingredientTypes) {
        if (ingredients.get(ingredientTypes) > 0) {
            Integer ingredientAmount = ingredients.get(ingredientTypes);
            ingredients.merge(ingredientTypes, ingredientAmount - 1, (oldValue, value) -> value);
            return Optional.of(ingredientTypes);
        }
        return Optional.empty();
    }
}
