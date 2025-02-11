package com.capgemini.personalized_meal_plan_generator;

public class Main {
    public static void main(String[] args) {
        HighProteinMeal highProteinMeal = new HighProteinMeal("Peanut Butter", 1200,"High protein meal");
        VeganMeal vegan = new VeganMeal("Peanut Butter", 1200,"vegan meal");
        KetoMeal keto = new KetoMeal("Peanut Butter", 1200,"keto meal");
        Meal<HighProteinMeal> peanutButter = new Meal<>(highProteinMeal);
        MealUtility proteinMealUtility = new MealUtility();
        proteinMealUtility.addMeal(peanutButter,"High protein meal");

        proteinMealUtility.displayMeal();
//        peanutButter.displayMeal();
//        highProteinMeal.displayMealInfo();
    }
}
