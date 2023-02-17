package com.example.streamexercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamExercisesApplication {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number > 5)
                .toList();
        System.out.println(filteredNumbers);

        List<Double> doubleNumbers = numbers.stream()
                .map(number -> (double) number/5)
                .toList();
        System.out.println(doubleNumbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(number -> System.out.print(" "+ number +" "));

    }
}
