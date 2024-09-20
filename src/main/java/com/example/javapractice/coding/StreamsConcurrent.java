package com.example.javapractice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class StreamsConcurrent {
    public static void main(String[] args) {
        List<String> listt = new ArrayList<>();
        listt.add("A");
        listt.add("B");
        listt.add("C");
        listt.add("D");

        // Simulating concurrent modification
        try {
            // Creating a stream and modifying the list concurrently
            listt.stream()
                    .peek(item -> {
                        System.out.println(item);
                        // This simulates concurrent modification

                            listt.remove(item); // This will throw ConcurrentModificationException
                    })
                    .toList();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println(Runtime.getRuntime().availableProcessors());
        // Print the final list
        ForkJoinPool pool = new ForkJoinPool();
        try(pool){
            System.out.println("ABC");
        }catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("Final list: " + listt);
    }
}
