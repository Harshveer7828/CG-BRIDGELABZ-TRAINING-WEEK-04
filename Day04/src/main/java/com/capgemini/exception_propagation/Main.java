package com.capgemini.exception_propagation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Get user input
            System.out.print("Enter your amount: ");
            double amount = Double.parseDouble(br.readLine().trim());

            System.out.print("Enter your rate: ");
            double rate = Double.parseDouble(br.readLine().trim());

            System.out.print("Enter your time: ");
            double time = Double.parseDouble(br.readLine().trim());

            // Invoke method and print result
            double result = ExceptionPropagation.calculateInterest(amount, rate, time);
            System.out.println("Calculated interest: " + result);

        } catch (IllegalArgumentException e) { // Catches invalid input cases
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) { // Catches IO exceptions
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
