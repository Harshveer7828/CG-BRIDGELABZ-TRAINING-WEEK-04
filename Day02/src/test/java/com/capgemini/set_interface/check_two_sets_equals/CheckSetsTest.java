package com.capgemini.set_interface.check_two_sets_equals;

import com.capgemini.set_interface.check_two_set_equals.EqualSet;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckSetsTest {
    EqualSet checkSet = new EqualSet();
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

    // Perform test one
    @Test
    void TestOne(){
        assertTrue(checkSet.isEqualSet(set1,set2));    // Returns true as both the sets are equal
    }


    @Test
    void TestSecond(){
        set1.add(5);
        assertTrue(checkSet.isEqualSet(set1,set2));    // Returns false as both the sets are not equal
    }
}
