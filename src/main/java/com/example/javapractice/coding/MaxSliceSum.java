package com.example.javapractice.coding;

public class MaxSliceSum {
    public static void main(String[] args) {
        int[] A= new int[]{-2,1};
        long totalSum=Integer.MIN_VALUE;
        long sum= Integer.MIN_VALUE;
        for (int j : A) {
            sum = Math.max(sum + j, j);
            totalSum = Math.max(totalSum, sum);
        }
        System.out.println((int)totalSum);
    }
}
