package com.study.java_study.chEX_조별과제용;

import java.util.Scanner;

public class LoginSystem {



    private String userId = "admin";
    private String password = "1234";
    Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.println("[ 로그인 ]");

        while (true) {
            System.out.println("아이디를 입력하세요.");
            System.out.print("아이디: ");
            String inputId = scanner.nextLine();
            System.out.println();

            System.out.println("비밀번호를 입력하세요.");
            System.out.print("비밀번호: ");
            String inputPassword = scanner.nextLine();

            if (inputId.equals(userId) && inputPassword.equals(password)) {
                System.out.println("로그인 성공");
                break;
            }

            System.out.println("아이디 또는 비밀번호가 맞지 않습니다. 다시 입력하세요");
        }
    }
}
