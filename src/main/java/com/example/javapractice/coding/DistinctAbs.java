package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class DistinctAbs {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] A = new int[]{-5,-3,-1,0,3,6};
        int[] B = new int[]{3,4,5,5,2};

        for(int a : A){
            set.add(a < 0 ? -a : a);
        }
        /* System.out.println(set); */
        IntStream intStream = Arrays.stream(A);
   String[] arr =  intStream.boxed().map(String::valueOf).toArray(String[]::new);
        String[] grp = new String[A.length];
   for(int i=0; i<arr.length-1; i++){
     grp = Arrays.copyOfRange(arr, i, i + arr.length);
   }
        System.out.println(Arrays.toString(grp));


    }

}
