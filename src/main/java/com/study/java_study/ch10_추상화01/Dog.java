package com.study.java_study.ch10_추상화01;

public class Dog extends Animal {

    private String bread;

    public Dog() {
        // super(); //Animal 객체 생성자 호출 무조건 맨위로 와야함 순서 중요
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(bread + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                '}';
    }


}
