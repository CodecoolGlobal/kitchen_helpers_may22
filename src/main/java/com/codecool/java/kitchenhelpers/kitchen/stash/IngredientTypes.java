package com.codecool.java.kitchenhelpers.kitchen.stash;

import java.util.Random;

public enum IngredientTypes {
    MEAT,
    POTATO,
    CARROT;
    public static IngredientTypes randomIngredient() {
        IngredientTypes[] ingredients =  IngredientTypes.values();
        return ingredients[new Random().nextInt(0, ingredients.length)];
    }
}
