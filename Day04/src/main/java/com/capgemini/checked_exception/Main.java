package com.capgemini.checked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ReadFile read = new ReadFile();

        // Get the filename from the user
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the file name: ");
            String fileName = br.readLine().trim();
            // Invoke the method which read the file
            read.readFile(fileName);
        }catch (IOException e){
            System.out.println("IO EXCEPTION Caught please enter a valid input " + e.getMessage() );
        }
    }
}
