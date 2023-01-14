package me.ikapkova.webproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import me.ikapkova.webproject.services.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/add")
    public String addRecipe(@RequestParam("recipeName") String recipeName,
                            @RequestParam("cookingTime") int cookingTime,
                            @RequestParam("ingredients") List<String> ingredients,
                            @RequestParam("stepsOfCooking") List<String> stepsOfCooking) {
        recipeService.addRecipe(recipeName, cookingTime, ingredients, stepsOfCooking);
        return "Рецепт " + recipeName + " добавлен";
    }

    @GetMapping("/{id}")
    public String getRecipe(@PathVariable("id") int id) {
        if (recipeService.getRecipe(id) != null) ;
        return recipeService.getRecipe(id);
    }
}