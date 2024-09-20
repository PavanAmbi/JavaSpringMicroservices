package com.example.javapractice;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello World12");
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
    try{
        filterList(list);
    }catch(Error err){
        System.out.println(err.getMessage());
    }
    }

    private static void filterList(List<Integer> list) {

        int sum = list.stream().reduce(TestClass::someIt).orElse(0);
        System.out.println(sum);
    }

    private static Integer someIt(Integer integer, Integer integer1) {
        int sum = integer + integer1;
        if(sum>5) {
            throw new CustomException("Invalid Numbers");
        }
        return sum;
    }
}

class CustomException extends RuntimeException {
    CustomException(String message) {
        super(message);
    }
}
