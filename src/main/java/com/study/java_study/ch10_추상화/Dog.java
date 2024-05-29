package com.study.java_study.ch10_추상화;

public class Dog extends Animal {

    private String bread;

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                '}';
    }

    public Dog() {
       // super(); //Animal 객체 생성자 호출 무조건 맨위로 와야함 순서 중요
        System.out.println("강아지 객체 생성");
    }
}
