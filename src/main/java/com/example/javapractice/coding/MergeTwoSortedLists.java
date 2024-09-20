package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        //Merge two sorted lists into a single sorted list using Java streams:

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

      Stream.concat(list1.stream(), list2.stream()).sorted().forEach(System.out::println);


    }
}
