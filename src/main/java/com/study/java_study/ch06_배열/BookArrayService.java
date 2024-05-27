package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서관리 프로그램]");
            System.out.println("1. 도서등록");
            System.out.println("2. 도서수정");
            System.out.println("3. 도서삭제");
            System.out.println("4. 도서찾기");
            System.out.println("5. 도서전체조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 : ");

            String selectMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selectMenu) {

                case "1":
                    System.out.println("[도서등록]");
                    newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++)  {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름 : ");
                    names[newNames.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;

                case "2":
                    System.out.println("[도서수정]");
                    System.out.print("수정 할 도서 : ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, modifyName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("수정 할 내용을 입력해주세요 : ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정완료!");
                    break;

                case "3":
                    System.out.println("[도서삭제]");
                    System.out.print("삭제 할 도서 :");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, removeName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 존재하지 않습니다.");
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
                    System.out.println("도서를 삭제하였습니다");
                    break;

                case "4":
                    System.out.println("[도서찾기]");
                    System.out.print("찾으실 도서를 입력하세요 : ");
                    String findName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, findName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서를 찾을 수 없습니다.");
                        break;
                    }
                    System.out.println("해당 도서는 등록되어 있습니다.");
                case "5":
                    System.out.println("[도서전체조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index : [" + i + "]" + names[i]);
                    }
                    break;

                case "q":
                    System.out.println("종료되었습니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");


            }


        }
    }
}
