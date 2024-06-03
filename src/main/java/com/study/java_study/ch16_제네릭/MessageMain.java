package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : Object 기호로 -> ? 표기

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); //하행 -> 자신포함 아래만 와일드카드로 쓰임
        Message<? super String> m4 = new Message<>(new Object()); //상행 -> 자신포함 위로만 와일드카드로 쓰임

        String s2 = m3.getMessage();
    }
}
