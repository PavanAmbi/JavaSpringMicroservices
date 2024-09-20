package com.example.javapractice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class LongestString {

    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("abWE","avcm","abcd9898","a2" , "mnopq");

        Optional<String> max = strings.stream().min(Comparator.comparing(String::length));
        max.ifPresent(System.out::println);

        int minimum=Integer.MAX_VALUE;

        Predicate<String> lengthCheck = str -> str.length()<Integer.MAX_VALUE;


        for(String s : strings) {
            if(s.length()<minimum) {
                minimum = s.length();
                System.out.println(s);
            }
        }
        System.out.println("minimum==> " + minimum);
    }
}
