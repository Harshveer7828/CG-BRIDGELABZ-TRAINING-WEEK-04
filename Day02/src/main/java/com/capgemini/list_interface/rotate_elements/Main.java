package com.capgemini.list_interface.rotate_elements;

import java.util.ArrayList;
import java.util.List;

import static com.capgemini.list_interface.rotate_elements.RotateList.rotateList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        int rotateBy = 2;

        System.out.println("Original List: " + list);
        List<Integer> rotatedList = rotateList(list, rotateBy);
        System.out.println("Rotated List: " + rotatedList);
    }
}
