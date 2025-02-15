package com.capgemini.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {

    // Method to read file
    public static void readFile(String fileName) throws IOException {
        String currentPath = "src/main/java/com/capgemini/try_with_resources/";
        try(BufferedReader br = new BufferedReader(new FileReader(currentPath + fileName))){
            System.out.println("File content starts from here---------------------");
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            System.out.println("File content end here-----------------------");
        }catch (IOException e){
            System.out.println("File not found");
            throw new IOException();
        }
    }
}
