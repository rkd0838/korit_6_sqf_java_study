package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        System.out.println("프로그램 시작");

        while (run) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 입금하기");
            System.out.println("2. 이체하기");
            System.out.println("3. 계좌조회");
            System.out.println("4. 기타메뉴");
            System.out.println("q. 종료하기");

            System.out.print("메뉴 선택 : ");
            String selectMenu1 = scanner.nextLine();
            System.out.println();
            switch (selectMenu1) {
                case "1":
                    System.out.println("[입금하기 메뉴]");
                    boolean run1 = true;
                    while (run1) {
                        System.out.println("1. 현금입금");
                        System.out.println("2. 수표입금");
                        System.out.println("3. 카드입금");
                        System.out.println("b. 이전단계");

                        System.out.print("메뉴 선택 : ");
                        String selectMenu2 = scanner.nextLine();
                        switch (selectMenu2) {
                            case "1":
                                System.out.println("입금하실 현금을 넣어주세요");
                                break;
                            case "2":
                                System.out.println("입금하실 수표를 넣어주세요");
                                break;
                            case "3":
                                System.out.println("입금하실 카드를 넣어주세요");
                                break;
                            case "b":
                                System.out.println("이전단계로 돌아갑니다.");
                                run1 = false;
                                break;
                            default:
                                System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
                        }
                        System.out.println();
                    }

                    break;
                case "2":
                    System.out.println("[이체하기 메뉴]");
                    boolean run2 = true;
                    while (run2) {
                        System.out.println("1. 통장으로 이체하기");
                        System.out.println("2. 체크카드로 이체하기");
                        System.out.println("3. 타행으로 이채하기");
                        System.out.println("b. 이전단계");

                        System.out.println("메뉴선택 : ");
                        String selectMenu3 = scanner.nextLine();
                        switch (selectMenu3) {
                            case "1":
                                System.out.println("이체하실 통장을 넣어주세요.");
                                break;
                            case "2":
                                System.out.println("이체하실 체크카드를 넣어주세요.");
                                break;
                            case "3":
                                System.out.println("이체하실 다른은행을 선택해주세요.");
                                break;
                            case "b":
                                System.out.println("이전단계로 돌아갑니다.");
                                run2 = false;
                                break;
                            default:
                                System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("[계좌조회 메뉴]");
                    boolean run3 = true;
                    while(run3) {
                        System.out.println("1. 계좌 잔액 조회");
                        System.out.println("2. 계좌 이체한도 조회");
                        System.out.println("3. 적금계좌 만기일 조회");
                        System.out.println("b. 이전단계");

                        System.out.print("메뉴선택 : ");
                        String selectMenu4 = scanner.nextLine();

                    }
                    break;
                case "4":
                    System.out.println("[기타메뉴]");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
