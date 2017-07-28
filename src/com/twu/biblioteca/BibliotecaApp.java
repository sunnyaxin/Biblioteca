package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    private static BookManager bookManager = new BookManager();
    private static List<Book> books = bookManager.initBookList();

    public static void main(String[] args) {
        System.out.println(welcome());
        printBookListName();
    }

    private static void printBookListName() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ". " + books.get(i).getName());
        }
    }

    static String welcome() {
        return "****** Welcome Biblioteca ******";
    }

}
