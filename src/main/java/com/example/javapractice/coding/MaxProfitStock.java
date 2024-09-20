package com.example.javapractice.coding;

public class MaxProfitStock {
    public static void main(String[] args) {
        int[] A = new int[]{23171,21011,21123,21366,21013,21367};
        int totalProfit = solution(A);
        System.out.println("totalProfit " + totalProfit);
    }
    public static int solution(int[] A) {
        if(A.length ==0) return 0;
        int minPrice=A[0];
        int profit =0;
        int totalProfit = 0;

        for(int i=1;i<A.length;i++){
            if(A[i]<minPrice){
                minPrice=A[i];
            }else{
                totalProfit = Math.max(totalProfit, A[i] - minPrice);
            }
        }
        return totalProfit;
    }
}
