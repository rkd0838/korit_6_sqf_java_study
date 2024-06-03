package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {


        /*  [Wrapper 자료형]
            Integer    --(언박싱)-->   int
            Boolean    <--(박싱)--     boolean
            Character                 char
            Double                    double
            Long                      long
            Float                     float
         */


        Integer num = new Integer(10); //박싱
        int mum2 = num.intValue();     //언박식

        Integer num3 = 20;             //자동 박싱
        int num4 = num3;               //자동 언박싱

        Sender sender1 = new Sender<Integer, String, Double>(10, "20", 3.14);
        // Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14);
        // 앞부분에 제네럴을 주고 뒤에 생략가능
        System.out.println(sender1);

    }

}
