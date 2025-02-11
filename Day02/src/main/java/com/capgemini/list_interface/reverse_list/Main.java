package com.capgemini.list_interface.reverse_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        // Output from the Array List
        System.out.println(reverse.reverseArrayList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));

        // Output from the linked list
        System.out.println(reverse.revrerseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));
    }
}
