package com.capgemini.personalized_meal_plan_generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealPlanGeneratorTest {

    HighProteinMeal highProteinMeal = new HighProteinMeal("Peanut Butter", 1200, "High protein meal");
    Meal<HighProteinMeal> peanutButter = new Meal<>(highProteinMeal);
    MealUtility proteinMealUtility = new MealUtility();

    @Test
    void testMethod() {
        // add value to the meals
        proteinMealUtility.addMeal(peanutButter, "High protein meal");
        assertEquals("Peanut Butter", peanutButter.getMeal().getName());
        assertEquals(1200, peanutButter.getMeal().getPrice());
        assertEquals("High protein meal", peanutButter.getMeal().getCategory());
    }

}
