package com.study.java_study.ch02_클래스01;

import javax.lang.model.element.NestingKind;

public class StudentMain {
    public static void main(String[] args) {
       Student student1 = new Student();
       Student student2 = new Student();
        //개체를 생성한다고 함

       student1.name = "손경태";
       student1.age = 29;
       student2.name = "신선애";
       student2.age = 25;

    }
}
