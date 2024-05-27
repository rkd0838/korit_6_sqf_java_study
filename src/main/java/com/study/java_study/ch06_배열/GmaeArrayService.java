package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class GmaeArrayService {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[게임정보관리 프로그램");
            System.out.println("1. 게임정보등록");
            System.out.println("2. 게임정보수정");
            System.out.println("3. 게임정보삭제");
            System.out.println("4. 게임정보검색");
            System.out.println("5. 게임목록보기");
            System.out.println("q. 프로그램종료");
            System.out.print("메뉴선택 : ");
            String selectMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selectMenu) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "q":
                default:

            }

        }
    }
}
