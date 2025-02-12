package com.capgemini.list_interface.remove_duplicates;

import java.util.List;

public class RemoveDuplicates {
    // Method to remove the duplicate elements
    public List<Integer> removeDuplicates(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size();) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                }else j++;
            }

        }
        return list;
    }
}
