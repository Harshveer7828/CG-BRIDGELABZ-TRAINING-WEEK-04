package com.capgemini.data_streams_store_and_retrieve_primitive_data;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "student_data.txt";  // Simplified file path to avoid path issues

        // Creating a sample student object
        Student student = new Student(101, "Harsh Veer", 3.75);

        // Delete old file to avoid reading stale/corrupt data
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Old file deleted successfully.");
            } else {
                System.out.println("Failed to delete the old file.");
            }
        }

        // Writing student data to a binary file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            System.out.println("Writing to file: " + student.rollNumber + ", " + student.name + ", " + student.gpa);

            dos.writeInt(student.rollNumber);
            dos.writeUTF(student.name);  // writeUTF stores the string with length metadata
            dos.writeDouble(student.gpa);
            dos.writeChars("mddfd");

            System.out.println("Student data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while writing data.");
        }

        // Reading student data from the binary file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Reading from file...");
            int rollNumber = dis.readInt();
            String name = dis.readUTF();  // readUTF reads the string properly
            double gpa = dis.readDouble();

            // Displaying the retrieved student data
            System.out.println("Retrieved Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while reading data.");
        }
    }
}