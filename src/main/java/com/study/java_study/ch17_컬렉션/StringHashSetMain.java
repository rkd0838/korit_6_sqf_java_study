package com.study.java_study.ch17_컬렉션;

import com.study.java_study.ch06_배열.Computer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();

        //추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        for (String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준이"));
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

//        Computer<String> stringComputer = new Computer<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
//            }
//        };
//
//        strList.sort(StringComparrator);

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);
    }
}
