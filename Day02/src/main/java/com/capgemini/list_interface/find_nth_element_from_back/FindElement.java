package com.capgemini.list_interface.find_nth_element_from_back;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindElement {
    // Method to find the nth element from the back
    public char findElement(List<Character> list, int pos) {
        if (list == null || pos <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Iterator<Character> first = list.iterator();
        Iterator<Character> second = list.iterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < pos; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("Position is larger than the list size");
            }
            first.next();
        }

        // Move both pointers until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // The second pointer is now at the Nth element from the end
    }
}
