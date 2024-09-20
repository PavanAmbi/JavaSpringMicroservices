package com.example.javapractice.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStringOperations {
    public static void main(String[] args) {

        String word = "abcda";

        Map<Character, Long> collect1 = word.chars().
                mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect1.forEach((k,v)-> {
            if(v>1){

               // System.out.println(k +" "+v);

            }
        });
        collect1.entrySet().stream().
                filter(k -> k.getValue() > 1).forEach(System.out::println);


        Map<String, Long> collect = Arrays.stream(word.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().forEach(System.out::println);
        long c = collect.get("a");
        System.out.println(c);

    }
}
