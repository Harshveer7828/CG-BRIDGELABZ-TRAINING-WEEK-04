package com.capgemini.exception_propagation;

public class ExceptionPropagation {
    public static double calculateInterest(double amount, double rate, double time) {
        if (amount < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Invalid input: Amount, rate, and time must be positive.");
        }
        return (amount * rate * time) / 100;
    }
}
