
package me.ikapkova.webproject.services.impl;

import java.util.Map;
import java.util.TreeMap;

import me.ikapkova.webproject.model.Ingredient;
import me.ikapkova.webproject.services.IngredientsService;
import org.springframework.stereotype.Service;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    public static Integer id = 1;
    private final Map<Integer, Ingredient> listIngredients = new TreeMap<>();

    @Override
    public String getIngredients(int id) {
        if (id < 1) {
            throw new RuntimeException("ID не может быть меньше нуля!");
        } else {
            return listIngredients.get(id).getName();
        }
    }
    @Override
    public void addIngredients(String name, int count, String measureUnit) {
        Ingredient ingredient = new Ingredient(name, count, measureUnit);
        listIngredients.put(id++, ingredient);
    }
}