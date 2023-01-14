package me.ikapkova.webproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Recipe {

    private String recipeName;
    private int cookingTime;
    private List<String> ingredients;
    private List<String> stepsOfCooking;
}

