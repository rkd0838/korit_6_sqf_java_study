package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;

    public BookService() {
        scanner = new Scanner(System.in);
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;
        while() {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if (menus.contains(selectedMenu)){
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");


        String selectedMenu = selectMenu();

        return isRun;
    }
}
