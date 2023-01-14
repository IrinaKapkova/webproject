package me.ikapkova.webproject.services;

import java.util.List;

public interface RecipeService {
    String getRecipe(int id);

    String addRecipe(String recipeName, int cookingTime, List<String> ingredients, List<String> stepsOfCooking);
}
