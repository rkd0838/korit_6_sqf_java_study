package com.study.java_study.chEX_조별과제용;

import java.util.Scanner;




public class While_true {
    public static String id = "test";
    public String password = "1234";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[ 로그인 ]");

        while(true) {
            System.out.print("아이디 입력: ");
            String inputId = scanner.nextLine();
            System.out.println();
            System.out.print("비밀번호 입력: ");
            String inputPassword = scanner.nextLine();

        }



//        System.out.println("[ 로그인 ]");
//
//        while (true) {
//            System.out.print("아이디 입력 : ");
//            String id2 = scanner.nextLine();
//            System.out.println();
//            System.out.print("패스워드 입력 : ");
//            String password2 = scanner.nextLine();
//
//        }
//
//
//

//            if (id2.equals(id)) {
//                if (password2.equals(password)) {
//                    System.out.println("로그인 성공!");
//                    break;
//                }
//                else System.out.println("아이디 또는 패스워드가 잘못되었습니다. 다시 입력해주세요");
//            }
//            else System.out.println("아이디 또는 패스워드가 잘못되었습니다. 다시 입력해주세요");

        }

    }

