package com.study.java_study.ch07_클래스02;

import java.sql.Struct;

public class StudyB {

    private String name; //private 내부에서 접근 가능하나 외부에서는 불가능
    private int age;

    public StudyB() {}

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
            System.out.println(name);
            System.out.println(age);

    }
}
