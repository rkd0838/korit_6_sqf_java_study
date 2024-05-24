package com.study.java_study.ch06_배열;

import java.beans.PropertyEditorSupport;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 : ");

            String selectMenu = scanner.nextLine();
            switch (selectMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length -1] = scanner.nextLine();
                    System.out.println("등록 완료!");

                    break;
                case "2":
                    System.out.println("[수정]");
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("수정 할 이름 : ");
                    String result2 = null;
                    String findName2 = scanner.nextLine();
                    for (String name : names) {
                        if (name.equals(findName2)) {
                            result2 = name;
                            System.out.print("수정 할 이름을 입력하세요 : ");
                            newNames  = scanner.nextLine();
                            break;
                        }
                    }
                    if (result2 == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }

                    System.out.println("수정 완료!");

                    break;
                case "3":
//                    System.out.println("[삭제]");
//                    System.out.println("삭제 할 이름 : ");
//                    String result = null;
//                    String deleteName = scanner.nextLine();
//                    for (String name : names) {
//                        if (name.equals(deleteName)) {
//                            result = name;
//                            break;
//                        }
//                    }
//                    if (result == null) {
//                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
//                        break;
//                    }
//                    System.out.println("이름이 삭제되었습니다.");
//                    names
//                    break;
//                case "4":
//                    System.out.println("[이름 찾기]");
//                    System.out.print("조회 할 이름 : ");
//                    String result = null;
//                    String fineName = scanner.nextLine();
//                    for (String name : names) {
//                        if (name.equals(fineName)) {
//                            result = name;
//                            break;
//                        }
//                    }
//                    if (result == null) {
//                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
//                        break;
//                    }
//                    System.out.println("해당 이름은 등록된 이름입니다.");
//                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                    System.out.println("index:[" + i + "]" + names[i]);
                }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
        }
            }
}
