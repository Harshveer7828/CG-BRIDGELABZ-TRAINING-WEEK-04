package com.capgemini.set_interface.check_two_set_equals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EqualSet checkSet = new EqualSet();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(checkSet.isEqualSet(set1,set2));
    }
}
