package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.List;

public class SumOfDiagonal {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> childList1 = new ArrayList<>();

        childList1.add(1);
        childList1.add(2);
        childList1.add(3);


        List<Integer> childList2 = new ArrayList<>(childList1);
        List<Integer> childList3 = new ArrayList<>(childList1);

        arr.add(childList1);
        arr.add(childList2);
        arr.add(childList3);

        int sumOfPrimaryDia=0;
        int sumOfSecondaryDia=0;
        int size = arr.size();
        for(int i=0; i<arr.size(); i++){
            sumOfPrimaryDia  = sumOfPrimaryDia + arr.get(i).get(i);
            sumOfSecondaryDia = sumOfSecondaryDia + arr.get(i).get((arr.size() - 1)-i);
            System.out.print(sumOfPrimaryDia);
            System.out.print(sumOfSecondaryDia);
            System.out.println();

        }
        System.out.println(Math.abs(sumOfPrimaryDia - sumOfSecondaryDia));

    }
}
