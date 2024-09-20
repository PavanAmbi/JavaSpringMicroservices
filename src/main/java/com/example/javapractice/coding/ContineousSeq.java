package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContineousSeq {
    public static void main(String[] args) {
        String arr[] = {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"};

      //  Arrays.stream(arr).map(i->Integer.parseInt(i)).forEach(System.out::println);
        String originalString ="ABCDEF";
        String subString = "";
        List<String> list = new ArrayList<>();

        for(int i=0; i<originalString.length(); i++){

            for(int j=0; j<=originalString.length(); j++){
                if(i<j){
                    subString = originalString.substring(i, j);
                }else{
                    subString = originalString.substring(j, i);
                }
               // if(subString.startsWith("AB")){
                System.out.println(subString);
                list.add(subString);
                //}
            }
        }
        System.out.println(list.size());
    }
}
