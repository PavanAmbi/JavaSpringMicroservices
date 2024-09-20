package com.example.javapractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachWord {
    public static void main(String[] args) {
        //Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> collect = words.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
        //Given a strings, find the frequency of each letter using Java streams:
        String str ="abcdab";
        Map<String, Long> collect1 = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.entrySet().stream().forEach(System.out::println);

    }
}
