package com.example.javapractice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberPrefix {
   // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(10,15,8,49,25,198,132));
        myList.stream().
                filter(ints ->ints.toString().startsWith("1")).
                toList().forEach(System.out::println);
    }
}
