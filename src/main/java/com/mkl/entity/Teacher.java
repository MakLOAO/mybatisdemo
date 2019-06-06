package com.mkl.entity;

import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private List<Student> studentList;

    public Teacher() { }

//    public Teacher(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public Teacher(int id, String name, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Teacher{id=" + id + ", name='" + name + '\'');
        for (Student s : studentList)
            stringBuilder.append(s);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
