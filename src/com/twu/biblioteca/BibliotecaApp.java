package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    private static BookManager bookManager = new BookManager();
    private static List<Book> books = bookManager.initBookList();

    public static void main(String[] args) {
        print(welcome());
        printBookListName();
    }

    private static void printBookListName() {
        for (Book book : books) {
            System.out.println(book.getId() + ". " + book.getName());
        }
    }

    static String welcome() {
        return "****** Welcome Biblioteca ******";
    }

    private static void print(String string){
        System.out.println(string);
    }
}
