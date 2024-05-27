package com.study.java_study.ch08_클래스03;

import java.sql.Struct;

public class StudentMain {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Student[] students = new Student[5];

        numbers[0] = 10;

        students[0] =  new Student(20240501, "김준일", 31);
        students[1] =  new Student(20240502, "김준이", 28);
        students[2] =  new Student(20240503, "김준삼", 25);

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());

        }

    }
}
