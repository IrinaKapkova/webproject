package me.ikapkova.webproject.services.impl;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import me.ikapkova.webproject.model.Recipe;
import me.ikapkova.webproject.services.RecipeService;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {
    public static Integer id = 1;
    private final Map<Integer, Recipe> listRecipes = new TreeMap<>();

    @Override
    public String getRecipe(int id) {
        if (id < 0) {
            throw new RuntimeException("Id введен некорректно!");
        } else {
            return listRecipes.get(id).getRecipeName();
        }
    }

    @Override
    public String addRecipe(String recipeName, int cookingTime, List<String> ingredients, List<String> stepsOfCooking) {
        Recipe recipe = new Recipe(recipeName, cookingTime, ingredients, stepsOfCooking);
        listRecipes.put(id++, recipe);
        return listRecipes.toString();
    }
}
