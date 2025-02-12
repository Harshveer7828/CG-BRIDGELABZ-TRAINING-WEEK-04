package com.capgemini.set_interface.union_and_intersection_of_two_set;

import com.capgemini.set_interface.union_and_intersection_of_sets.UnionAndIntersection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckUnionAndIntersection {
    // Create an object for the UnionAndIntersection class
    UnionAndIntersection findUnionAndIntersection = new UnionAndIntersection();
    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    // First test case for union and intersection

    @Test
    void checkUnionAndIntersection(){
        Set<Integer> intersection = findUnionAndIntersection.intersection(set1,set2);
        Set<Integer> union = findUnionAndIntersection.union(set1,set2);

        assertEquals(new HashSet<>(List.of(3)),intersection);
        assertEquals(new HashSet<>(Arrays.asList(1,2,3,4,5)),union);
    }

    @Test
    void failedCheckUnionAndIntersection(){
        Set<Integer> intersection = findUnionAndIntersection.intersection(set1,set2);
        Set<Integer> union = findUnionAndIntersection.union(set1,set2);

        assertEquals(new HashSet<>(List.of(3,4)),intersection);
        assertEquals(new HashSet<>(Arrays.asList(1,2,3,4,5,1,2)),union);
    }


}
