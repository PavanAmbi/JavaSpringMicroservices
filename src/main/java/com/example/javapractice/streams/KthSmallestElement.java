package com.example.javapractice.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        //1,2,3,4,5,6,7
        int k=7;
        OptionalInt any = Arrays.stream(array).sorted().skip(k-1).limit(1).findFirst();
        any.ifPresent(System.out::println);
    }
}
