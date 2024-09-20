package com.example.javapractice.coding.strings;

public class VowelPresent {
    public static void main(String[] args) {
        String str ="Hello";

      boolean flag = str.toLowerCase().matches("[aeiou]");
        System.out.println(flag);
    }
}
