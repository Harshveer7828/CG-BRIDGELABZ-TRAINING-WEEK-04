package com.capgemini.unchecked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Buffer reader to get the two number as the input
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the number: ");
            Integer num1 = Integer.parseInt(br.readLine().trim());

            System.out.println("Enter the second number: ");
            Integer num2 = Integer.parseInt(br.readLine().trim());

            if (num2 == 0) throw new ArithmeticException("Cannot divided by zero | Invalid input");
            System.out.println(Divide.divide(num1,num2));
        }catch (IOException e){
            System.out.println("Exception caught please enter a valid input " + e.getMessage());
        }catch (InputMismatchException e){  // We already parse the string into the integer above so input mismatch never caused
            System.out.println("Exception caught input mismatch please enter a valid input and try again " + e.getMessage());
        }
    }
}