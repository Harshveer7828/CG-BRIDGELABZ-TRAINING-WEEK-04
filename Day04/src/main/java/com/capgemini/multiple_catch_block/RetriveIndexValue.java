package com.capgemini.multiple_catch_block;

public class RetriveIndexValue {
    // Method to retrieve the value
    public static boolean retrieve(int[] arr,int index){
        if (arr.length > 0) {
            System.out.println("value at index " + index +" is "  + arr[index]);
            return true;
        }
        return false;
    }
}
