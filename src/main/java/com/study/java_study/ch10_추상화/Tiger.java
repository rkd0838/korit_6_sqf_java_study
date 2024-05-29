package com.study.java_study.ch10_추상화;

public class Tiger extends Animal {
       private int power;

    public Tiger() {
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능
    @Override //@ 어노테이션, @Override 는 특별한 기능은없으며 재정의 했음을 표기하기위한 용도
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }


}
