package com.capgemini.custom_exception;

public class ValidateAge {
    // Method which validate the age
    public static void validateAge(Integer age) throws InvalidAgeException{
        if (age < 18)  throw new InvalidAgeException("You are not eligible");
    }
}
