package com.hemant.design_patterns.creational.builder;

public class Student {
    private String name;
    private String address;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.address = studentBuilder.address;
        this.id = studentBuilder.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    private Student(){}

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder{
        private String name;
        private String address;
        private Integer id;

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public StudentBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }
}
