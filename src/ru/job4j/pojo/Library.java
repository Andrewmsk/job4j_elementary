package ru.job4j.pojo;

import java.util.Arrays;

public class Library {

    public static void main(String[] args) {
        Book firstBook = new Book("First Book", 500);
        Book secondBook = new Book("Second Book", 533);
        Book thirdBook = new Book("Third Book", 545);
        Book fourthBook = new Book("Clean code", 777);

        Book[] books = {firstBook, secondBook, thirdBook, fourthBook};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        Arrays.stream(books).forEach(System.out::println);
        Arrays.stream(books).filter(a -> a.getName().equals("Clean code")).forEach(System.out::println);


    }
}
