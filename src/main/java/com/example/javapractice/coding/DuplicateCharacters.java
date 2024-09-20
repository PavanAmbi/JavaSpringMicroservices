package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str ="hi hello";

        Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().
                        stream().filter(entry ->entry.getValue()>1).
                        forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
