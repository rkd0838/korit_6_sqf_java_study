package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {

    public static void main(String[] args) {
        // <- 주석
        // [ 일반 자료형 ]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        // 2. 숫자(정수)
        int c = 100000;
        long d = 100000000000l; // long은 값 뒤에 무조건 l

        // 3. 숫자(실수)
        double e = 3.14;

        // 4. answk
        char f = '가'; //AC00 아스키코드 값


        // 5. 문자열
        String g = "가나";

        System.out.println((char)((int)f + 1)); //형변환

        // 형변환 문자 -> 정수 -> 실수 의 형태로 변환가능


        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num; // 명시적 형변환 (버려지는값이 있어 표기를해줌) downcasting
        System.out.println(num2);
        double num3 = num2; // 묵시적 형변환 (버려지는값이 없어 표기를 안해줘도됨) upcasting
        System.out.println(num3);


    }
}
