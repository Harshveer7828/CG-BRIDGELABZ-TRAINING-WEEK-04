package com.capgemini.personalized_meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class MealUtility {
    private List <Meal<? extends MealPlan>> list = new ArrayList<>();

    void addMeal(Meal<? extends MealPlan> meal, String category){
        System.out.println("-------------------meal " + meal.getMeal().getCategory());
        if (meal.getMeal().getCategory().equals(category)) this.list.add(meal);
    }

    public void displayMeal() {
        for (Meal<? extends MealPlan> meal : list) {
            meal.displayMeal();
            System.out.println("---------------------------------");
        }
    }

}
