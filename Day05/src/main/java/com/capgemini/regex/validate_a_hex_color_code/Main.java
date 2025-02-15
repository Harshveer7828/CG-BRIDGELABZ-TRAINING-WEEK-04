package com.capgemini.regex.validate_a_hex_color_code;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        //use try and catch to handle exception if occurs
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input
            System.out.print("Enter the color code: ");
            String colorCode = br.readLine().trim();

            System.out.println((com.capgemini.regex_problems.validate_a_hex_color_code.ValidateHexColorCode.isValid(colorCode) ? "Valid" : "Invalid"));
        }catch (IOException e){
            System.out.println("Exception caught "+e.getMessage());
        }
    }
}
