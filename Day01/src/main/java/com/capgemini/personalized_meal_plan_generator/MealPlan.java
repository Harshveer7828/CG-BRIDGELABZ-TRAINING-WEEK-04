package com.capgemini.personalized_meal_plan_generator;


public interface MealPlan {
    public String getName();
    public double getPrice();
    public String getCategory();

    // Method to display the meal information
    public void displayMealInfo();
}
