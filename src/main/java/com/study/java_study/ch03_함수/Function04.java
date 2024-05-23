package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);

    }
    // 동일한 호출명을 가지고있을때 매개변수의 수나 매개변수자료형이 다를경우 값에따라 자동으로 찾아감
    // 이렇게 호출명은 값지만 매게변수자료형이 다른경우를 오버로딩이라 한다

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }
}
