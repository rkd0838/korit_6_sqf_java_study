package com.study.java_study.ch15_Static;

/*
    스태틱(Static)
    1. 공유 영역
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다.

    사용하는경우
    1. 하나만 만들어서 공유해야하는경우
    2. 두개이상 만들 필요가 없을경우

    싱글톤에서의 핵심기술은 스태틱이다.


 */
public class StaticMain01 {

    public static void main(String[] args) {
        System.out.println(Static01.num);
        Static01.num = 20;
        System.out.println(Static01.num);

        Static01 static01 = new Static01();
        static01.num = 30;
        System.out.println(Static01.num);
    }
}
