package com.example.javapractice.coding;

public class Palindrome {

    public static void main(String[] args) {
        String str = "aba";

        boolean flag = checkIfPalindrome(str);

    }

    private static boolean checkIfPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
