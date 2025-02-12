package com.capgemini.list_interface.remove_duplicates;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RemoveDuplicatesTest {
    RemoveDuplicates remove = new RemoveDuplicates();
    ArrayList<Integer> list = new ArrayList<>();
    @Test
    void testCheckOne(){
        assertEquals(Arrays.asList(3,1,2,4),remove.removeDuplicates(new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4))));
    }
    // Failed test case
    @Test
    void testCheckFailedSecond(){
        assertEquals(Arrays.asList(5,1,2,4),remove.removeDuplicates(new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4))));
    }
}
