package com.capgemini.set_interface.union_and_intersection_of_sets;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    // Method to find the union of the set
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> ans = new HashSet<>();
        // Add all the element in the set to find the union
        ans.addAll(set1);
        ans.addAll(set2);
        return ans;
    }

    // Method to find the intersection of the two set
    public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersectionSet = new HashSet<>();

        for (int i = 0; i < set1.size(); i++) {
            Object[] arr = set1.toArray();
            if (set2.contains((Integer)arr[i])) intersectionSet.add((Integer )arr[i]);
        }

        return intersectionSet;
    }
}
