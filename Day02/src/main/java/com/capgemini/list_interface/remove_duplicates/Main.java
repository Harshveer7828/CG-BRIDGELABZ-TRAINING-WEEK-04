package com.capgemini.list_interface.remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
        System.out.println(remove.removeDuplicates(new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4))));
    }
}
