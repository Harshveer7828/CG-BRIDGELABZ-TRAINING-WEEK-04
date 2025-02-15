package com.capgemini.try_with_resources;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter the file name:- ");
            String fileName  = br.readLine().trim();
            ReaderFile.readFile(fileName);
        }catch (IOException e){
            System.out.println("Error reading file IO exception occurred");
        }
    }
}
