package com.study.java_study.ch15_Static;

public class StudentRepository {


    /*
        스태틱 조건
        1. 자기자신을 매체 instance 변수를 둬야함
        2. 외부에서 접근되면안됨
        3. static 메소드 하나를 만들어야한다.
     */
    private static StudentRepository instance;
    private String[] names;

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }
    public void add(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
