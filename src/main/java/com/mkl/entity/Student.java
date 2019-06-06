package com.mkl.entity;

public class Student {

    private int id;
    private String name;
//    // 这是多对一关系的实现，多个学生对应一个老师
//    private Teacher teacher;

    public Student() { }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //    public Student(int id, String name, Teacher teacher) {
//        this.id = id;
//        this.name = name;
//        this.teacher = teacher;
//    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", teacherId=" + teacher.getId() +
//                ", teahcerName=" + teacher.getName() +
//                '}';
//    }
}
