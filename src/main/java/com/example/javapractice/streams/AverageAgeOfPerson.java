package com.example.javapractice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageAgeOfPerson {

    public static void main(String[] args) {
        List<Resource> resources = Arrays.asList(
         new Resource("Alice", 20),
         new Resource("Bob", 30),
         new Resource("Charlie", 10));

        Double collect = resources.stream().collect(Collectors.averagingInt(Resource::getAge));

        Optional<Integer> sum = resources.stream().map(Resource::getAge).reduce(Integer::sum);
        double avg1=resources.stream().map(Resource::getAge).mapToDouble(i->i).average().getAsDouble();
        int avg = sum.get()/resources.size();
        System.out.println(avg1);
    }
}
class Resource {
    int age;
    String name;
    public Resource(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
