package com.capgemini.list_interface.find_nth_element_from_back;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        FindElement find = new FindElement();
        System.out.println(find.findElement(new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E')), 2));
    }
}
