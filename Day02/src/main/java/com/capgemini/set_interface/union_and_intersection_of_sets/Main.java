package com.capgemini.set_interface.union_and_intersection_of_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        UnionAndIntersection find = new UnionAndIntersection();

        System.out.println("Union of two set is: " + find.union(set1,set2));
        System.out.println("Intersection of the two set: " + find.intersection(set1,set2));
    }
}
