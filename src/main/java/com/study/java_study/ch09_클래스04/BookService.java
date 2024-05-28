package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        BookRepository BookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;
        while (true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if (menus.contains(selectedMenu)) {
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

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }

    private String validataValue(String title) {
        String value = null;
        while (true) {

            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if (!value.isBlank()) {
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요.");

        }
        return value;

    }

    private String duplicateBookName() {
        String booKname = null;
        while (true) {
            booKname = validataValue("도서");
            if (bookRepository.findBookByBookName(booKname) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시입력하세요.");
        }
        return booKname;
    }


    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName =duplicateBookName();
        String author = validataValue("저자");
        String publisher = validataValue("출판사");

        BookEntity book= new BookEntity(bookId, bookName, author, publisher);
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");

    }
    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합검색");
        System.out.println("2. 도서명검색");
        System.out.println("3. 저자명검색");
        System.out.println("4. 출판사명검색");
        System.out.print("옵션선택 : ");
        String option = scanner.nextLine();
        scanner.nextLine();
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");
        if (searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for (BookEntity book : searchBooks) {
            System.out.println(book.toString());
            System.out.println();
        }

    }

}
