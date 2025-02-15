package com.capgemini.custom_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the user age: ");
            int age = Integer.parseInt(br.readLine());
            // validate age
            ValidateAge.validateAge(age);

            System.out.println("Your welcome you are eligible.");
        }catch (IOException e){
            System.out.println("IO EXCEPTION Occurred please enter a valid input " + e.getMessage());
        }catch (InvalidAgeException e){
            System.out.println("Invalid age exception caught " + e.getMessage());
        }
    }
}
