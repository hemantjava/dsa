package com.hemant.other;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateEmployee {

    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1, "Hemant"), new Employee(2, "Hemant"));

        list.stream()
                .filter(e -> list.stream().filter(Predicate.isEqual(e)).count() > 1)
                .collect(Collectors.toList()).forEach(System.out::println);
    }


}
