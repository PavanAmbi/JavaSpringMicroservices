package com.example.javapractice.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrimeList {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{5,1,3,9,34,11,10};

        Integer[] array = Stream.of(ints).filter(each -> each % 2 == 0).toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));
    }
}
