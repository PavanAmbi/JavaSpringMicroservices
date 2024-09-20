package com.example.javapractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        //Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> odd;
        List<Integer> even;

        Predicate<Integer> isOdd = num ->num %2 !=0;
        Predicate<Integer> isEven = num ->num %2 ==0;

        odd = numbers.stream().filter(isOdd).toList();
        even = numbers.stream().filter(isEven).toList();

        Map<Boolean, List<Integer>> collect = numbers.stream().
                collect(Collectors.partitioningBy(num -> num % 2 == 0));
        collect.get(true).forEach(System.out::println);
        collect.get(false).forEach(System.out::println);

    }
}
