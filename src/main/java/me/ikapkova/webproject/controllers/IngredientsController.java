package me.ikapkova.webproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import me.ikapkova.webproject.services.IngredientsService;

@RestController
@RequestMapping("/ingredient")
public class IngredientsController {

    private final IngredientsService ingredientsService;

    public IngredientsController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @GetMapping("/add")
    public String addIngredients(@RequestParam("name") String name,
                                 @RequestParam("count") int count,
                                 @RequestParam("measure Unit") String measureUnit) {
        ingredientsService.addIngredients(name, count, measureUnit);
        return "Был добавлен ингридиент:" + name + " " + count + " " + measureUnit;
    }

    @GetMapping("/{id}")
    public String getIngredients(@PathVariable("id") int id) {
        if (ingredientsService.getIngredients(id) != null) ;
        return ingredientsService.getIngredients(id);
    }
}
