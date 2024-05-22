package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10; // 유저가 커스터마이징 하는 정보를 class 라고 함
        ObjectA objectA1 = new ObjectA(); //100번 주소
        ObjectA objectA2 = new ObjectA(); //200번 주소
        System.out.println(a); //Art + Shift + 위아래 방향키 = 줄 옮기기
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);
    }

}
