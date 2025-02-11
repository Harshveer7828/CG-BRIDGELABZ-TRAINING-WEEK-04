package com.capgemini.list_interface_reverse_list;

import com.capgemini.list_interface.reverse_list.Reverse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class CheckReverseList {
    Reverse reverse = new Reverse();

    // Test to check the list is reversed or not
    @Test
    void testOne(){
        assertEquals(Arrays.asList(5,4,3,2,1),reverse.reverseArrayList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        assertEquals(Arrays.asList(5,4,3,2,1),reverse.revrerseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));

    }
    // Failed test case
    @Test
    void testSecond(){
        assertEquals(Arrays.asList(1,2,3,2,1),reverse.reverseArrayList(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        assertEquals(Arrays.asList(5,1,3,2,1),reverse.revrerseLinkedList(new LinkedList<>(Arrays.asList(1,2,3,4,5))));

    }
}
