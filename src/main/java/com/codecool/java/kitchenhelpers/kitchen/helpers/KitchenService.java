package com.codecool.java.kitchenhelpers.kitchen.helpers;

import com.codecool.java.kitchenhelpers.kitchen.employees.KitchenHelper;
import com.codecool.java.kitchenhelpers.kitchen.exceptions.OutOfIngredientsException;
import com.codecool.java.kitchenhelpers.kitchen.stash.IngredientTypes;
import lombok.Getter;

import java.util.List;
import java.util.Optional;

@Getter
public class KitchenService {
    private List<KitchenHelper> kitchenHelpers;


    public void addHelper(KitchenHelper kitchenHelper) {
        kitchenHelpers.add(kitchenHelper);
    }

    public void removeHelper(KitchenHelper kitchenHelper) {
        kitchenHelpers.remove(kitchenHelper);
    }

    public IngredientTypes requestIngredient(IngredientTypes ingredientTypes) throws OutOfIngredientsException {
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            Optional<IngredientTypes> optionalIngredientTypes = kitchenHelper.giveIngredient(ingredientTypes);
            if (optionalIngredientTypes.isPresent()) {
                return optionalIngredientTypes.get();
            }
        }
        throw new OutOfIngredientsException();
    }
}
