package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutations {
    public static void main(String[] args) {
        String str = "ABCDEF";
        Set<String> permutations = new HashSet<>();
        generatePermutations("", str, permutations);

        // Print all permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }

        // Print the total number of permutations
        System.out.println("Total number of arrangements: " + permutations.size());
    }

    private static void generatePermutations(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Generate new permutations
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }
}