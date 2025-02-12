package com.capgemini.set_interface.check_two_set_equals;

import java.util.Set;

public class EqualSet {
    //Method to check if the set is equal or not
    public boolean isEqualSet(Set<Integer> set1, Set<Integer> set2){
        if (set1.size() != set2.size()) return false; // return false if the set size is different

        return set1.containsAll(set2);
    }
}
