package com.study.java_study.ch14_오브젝트;

import javax.lang.model.element.NestingKind;
import java.util.Objects;

/*
    순서
    1. 변수 정의
    2. 생성자
    3. getter setter
    4. equals
    5. hashCode
    6. toString
 */
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
    this.name = name;
        this.age = age;
    }

    // getter and setter

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    @Override
    public int hashCode() { //주소값
        return Objects.hash(name, age); //hash 안에 들어간 문자가 같으면 값은 주소값이나옴
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
