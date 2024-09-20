package com.example.javapractice.coding;

import java.util.*;
import java.util.function.BiFunction;

public class RunnableDemo {
    public static void main(String[] args) {

        String[] str = new String[]{"jjds", "dfa", "fs", "sadada", "ads"};

        //Arrays.stream(str).sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).forEach(System.out::println);
        List<String> str1 = new ArrayList<>(List.of(str));
        str1.add("xsxsxsx");

        Set<String> string = new TreeSet<>(List.of(str));
        string.add("abc");
        string.add("mkmk");


        Comparator<String> lengthComparator = new Comparator<>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };


        Comparator<String> comparatorLambda = (String s1 , String s2) -> (s2.length()-s1.length());

        BiFunction<String, String, Integer> compBiFunction = (String s1 , String s2) -> (s2.length()-s1.length());

        BiFunction<Integer, Integer, Integer> biFun = (x, y) -> x - y;
        System.out.println(biFun.apply(1,2));
        Arrays.sort(str, lengthComparator);
        //System.out.println(Arrays.toString(str));
    }
}
