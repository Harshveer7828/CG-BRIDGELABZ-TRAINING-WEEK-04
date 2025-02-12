package com.capgemini.list_interface.find_nth_element_from_the_back;

import com.capgemini.list_interface.find_nth_element_from_back.FindElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNthElementTest {
    FindElement find = new FindElement();
    // Test case one
    @Test
    void findElementTestOne(){
        assertEquals('D',find.findElement(new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E')),2));
    }
    // Test case second
    @Test
    void findElementTestSecond(){
        assertEquals('E',find.findElement(new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E')),2)); // Failed as the result is D not E
    }
}
