package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibbonacci {
    public static void main(String[] args) {
     //   fibbonacci(10);
        String[] arr = new String[]{"dsds","dsds"};
        String str = "Hi Hello";

        Map<String, Long> collect = Arrays.stream(str.split(" ")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        // Map<String, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static void fibbonacci(int n) {

        int n1=0;
        int n2=1;
        for(int i=2; i<n ; i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3 +" ");
            }


    }
}
