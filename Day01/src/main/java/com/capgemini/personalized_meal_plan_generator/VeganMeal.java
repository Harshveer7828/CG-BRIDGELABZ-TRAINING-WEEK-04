package com.capgemini.personalized_meal_plan_generator;

public class VeganMeal implements MealPlan{
    private String mealName;
    private double price;
    private String category;

    VeganMeal(String mealName, double price, String category){
        this.category = category;
        this.mealName = mealName;
        this.price = price;
    }

    @Override
    public String getName() {
        return mealName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void displayMealInfo() {
        System.out.println("Meal Name -> " + mealName +
                "\nMeal Price: " + price +
                "\nMeal Category: " + category);
    }

}
