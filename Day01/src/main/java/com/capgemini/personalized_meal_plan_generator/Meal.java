package com.capgemini.personalized_meal_plan_generator;

public class Meal<T extends MealPlan> {
    private T mealPlan;
    Meal(T mealPlan){
        this.mealPlan = mealPlan;
    }

    // Getter to get meal
    T getMeal(){
        return mealPlan;
    }

    public void displayMeal() {
        mealPlan.displayMealInfo();
    }
}
