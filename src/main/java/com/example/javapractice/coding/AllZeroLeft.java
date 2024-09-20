package com.example.javapractice.coding;

import java.util.Arrays;
import java.util.function.Consumer;

public class AllZeroLeft {
    public static void main(String[] args) {
        int[] array =new int[]{1,1,0,1,0};
        int[] result = new int[array.length];
        int i=0,j=array.length-1;

      while(i< array.length){
           if(array[i]== 0 || array[j]== 0){
               result[i]=0;
               i++;
           }if(array[j]==1 || array[i]==1){
               result[j]=1;
               j--;
           }
       }
        System.out.println(Arrays.toString(result));
    }

}
