package com.capgemini.list_interface.reverse_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Reverse {
    // Method which reverse the Array list
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

        return list;
    }

    // Method to reverse the linked list
    public LinkedList<Integer> revrerseLinkedList(LinkedList<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        return list;
    }

}
