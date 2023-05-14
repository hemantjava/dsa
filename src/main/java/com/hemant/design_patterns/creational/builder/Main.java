package com.hemant.design_patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .address("CG")
                .name("Sonu")
                .build();
        System.out.println(student);
    }
}
