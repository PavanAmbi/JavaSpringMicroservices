package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberFormat {

    public static void main(String[] args) {

        List<Long> ar = new ArrayList<>();
        ar.add(1L);
        ar.add(2L);
        System.out.println(ar);

        long sum = ar.stream().mapToLong(p->p).sum();
        System.out.println(sum);


    }
}
