package com.study.java_study.ch06_배열;

import java.beans.PropertyEditorSupport;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
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

            String[] newNames = null; //공통된 변수값은 스위치 위로 빼야지 전체적용
            int findIndex = -1;
            switch (selectMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];
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
                    System.out.print("수정 할 이름 : ");
                    String modifyName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, modifyName);
                    if (findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름 : ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");

                    break;
                case "3":
                    System.out.println("[삭제]");
                    System.out.print("삭제 할 이름 : ");
                    String removeName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, removeName);
                    if (findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for (int i = 0; i < newNames.length; i++) {
                        if (i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                }
                    names = newNames;
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름 : ");
                    String fineName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, fineName);
                      if (findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
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
