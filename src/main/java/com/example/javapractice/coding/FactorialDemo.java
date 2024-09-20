package com.example.javapractice.coding;



public class FactorialDemo {
   static int counter=0;
    public static void main(String[] args) {
        int n = 24;
      //  int fact = factorial(n);
        int fact1 = factorial1(n);
       // System.out.println(fact);
        System.out.println(fact1);
        System.out.println(counter);

    }

    private static int factorial(int n) {
        if(n == 0) return 1;
        counter++;
        return n*factorial(n-1);
    }

    private static int factorial1(int n){

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                counter+=2;
            }
        }
        return counter;
    }
}
