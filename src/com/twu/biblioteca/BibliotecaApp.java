package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static BookManager bookManager = new BookManager();
    static List<Book> books = bookManager.initBookList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        print(welcome());
        print(printListBooksOptions());
        printDifferentOption(getSelectedOption());
    }

    private static void printDifferentOption(String selectedOption) {
        if(selectedOption.equals("List Books")){
            printBookListName();
            printSelectedBookDetails(bookManager.findBookById(getSelectedBookId()));
        }
    }

    private static void printSelectedBookDetails(Book selectedBook) {
        print("****** Book Details ******");
        print("Book Name: "+ selectedBook.getName());
        print("Book Author: "+ selectedBook.getAuthor());
        print("Book Year Published: "+ selectedBook.getYear());
    }

    private static String getSelectedOption() {
        print("Please select option:");
        return scanner.nextLine();
    }

    private static int getSelectedBookId() {
        print("Please select number of the book:");
        return scanner.nextInt();
    }

    private static void printBookListName() {
        print("****** Book List ******");
        for (Book book : books) {
            System.out.println(book.getId() + ". " + book.getName());
        }
    }

    static String welcome() {
        return "****** Welcome Biblioteca ******";
    }

    static String printListBooksOptions() {
        return "List Books";
    }

    private static void print(String string){
        System.out.println(string);
    }
}
