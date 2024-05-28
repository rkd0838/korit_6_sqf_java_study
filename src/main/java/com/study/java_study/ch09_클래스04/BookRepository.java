package com.study.java_study.ch09_클래스04;


import com.sun.source.tree.NewArrayTree;

import java.awt.print.Book;

//저장소 -> CRUD
public class BookRepository {

    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0];
    }

    private void extendBooks() {

            //기존 배열보다 크기가 하나 더 큰 배열을 생셩한다.
            BookEntity[] newBooks = new BookEntity[books.length + 1];

            //기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
            for (int i = 0; i < books.length; i++) {
                newBooks[i] = books[i];
            }
            //기존 배열의 주소가 들어있는 books 변수에 새로우 배열의 주소를 대입한다.
            books = newBooks;
            newBooks = null;
    }
        private int getLastIndex() {
            return books.length - 1;
        }

        public void saveBook (BookEntity book) {
            extendBooks();

            //새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 개채를 대입한다.
            books[getLastIndex()] = book;
        }
        public BookEntity findBookByBookId (int bookId) {
            BookEntity findBook = null;
            //선형탐색
            for (BookEntity book : books) {
                if (book.getBookId() == bookId) {
                    findBook = book;
                    break;
                }
            }

            return  findBook;
        }
        //단건조회
        public BookEntity findBookByBookName(String bookName) {
            BookEntity findBook = null;
            for (BookEntity book : books) {
                //String 문 이기에 equals 사용.
                if (book.getBookName().equals(bookName)) {
                    findBook = book;
                    break;
                }
            }
            return findBook;
        }
        private int getNewArraySize(int option, String searchText){
            int i = 0;
            //contains -> 해당 문자열에 포함되어있는가


        }
        //다건조회
        public BookEntity[] searchBooks(int option, String searchText) {
            int newArraySize = getNewArraySize(option, searchText);


            BookEntity[] searchBooks = new BookEntity[newArraySize];

            int i = 0;

            switch (option) {
                case 1: //통합검색
                    for (BookEntity book : books) {
                        if (book.getBookName().contains(searchText)
                                || book.getAuthor().contains(searchText)
                                || book.getPublisher().contains(searchText)) {
                            searchBooks[i] = book;
                            i++;
                        }
                    }
                    break;
                case 2: //도서명검색
                    for (BookEntity book : books) {
                        if (book.getBookName().contains(searchText)) {
                            searchBooks[i] = book;
                            i++;
                        }
                    }
                    break;
                case 3: //저자명검색
                    for (BookEntity book : books) {
                        if (book.getAuthor().contains(searchText)) {
                            searchBooks[i] = book;
                            i++;
                        }
                    }
                    break;
                case 4: //출판사명검색
                    for (BookEntity book : books) {
                        if (book.getPublisher().contains(searchText)) {
                            searchBooks[i] = book;
                            i++;
                        }
                    }
           }

            return searchBooks;

    }
}







