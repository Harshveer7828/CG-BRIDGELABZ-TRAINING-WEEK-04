package com.capgemini.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    // Method to read the file
    public boolean readFile(String fileName) throws IOException{
        String currentPath = "src/main/java/com/capgemini/checked_exception/";

        // Read file using buffered reader
        try(BufferedReader br = new BufferedReader(new FileReader(currentPath + fileName))){
            String line;
            System.out.println("-----------This the file content ----------");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("----------- File content End here ----------");
        }catch (FileNotFoundException e){
            System.out.println("File not found please enter a valid please check file path " + e.getMessage());
            return false;
        }catch (IOException e){
            System.out.println("IO Exception caught invalid input " + e.getMessage());
            return false;
        }

        return true;
    }
}
