package com.mkl.entity;

public class Person {
    private int id;
    private String name1;
    private int age;

    public Person() {
    }

    public Person(int id, String name1, int age) {
        this.id = id;
        this.name1 = name1;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.id + "," + this.name1 + "," + this.age;
    }
}
