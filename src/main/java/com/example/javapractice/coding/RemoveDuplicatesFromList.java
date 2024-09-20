package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        //Remove duplicates from a list while preserving the order using Java streams
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> collect = numbersWithDuplicates.
                stream().distinct().
                toList();
        collect.forEach(System.out::println);
    }
}
