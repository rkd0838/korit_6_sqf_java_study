package com.study.java_study.ch14_오브젝트;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
// 아래의 @Data 하나로 위의 4개를 전부 적용가능
@Data
public class Teacher {
    private String name;
    private int age;


}
