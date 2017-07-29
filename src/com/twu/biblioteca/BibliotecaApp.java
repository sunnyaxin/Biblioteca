package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static BookManager bookManager = new BookManager();
    static List<Book> books = bookManager.initBookList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            print(welcome());
            print(printListBooksOptions());
            print(printQuitOptions());
            String selectedOption = getSelectedOption();
            if (selectedOption.equals("Quit"))
                break;
            printDifferentOption(selectedOption);
        }
    }

    private static void printDifferentOption(String selectedOption) {
        if (selectedOption.equals("List Books")) {
            printBookListName();
            Book selectedBook = bookManager.findBookById(getSelectedBookId());
            printSelectedBookDetails(selectedBook);
            print(printCheckoutBook());
            printCheckoutBookResult(selectedBook, getCheckoutOption());
        } else {
            print("Select a valid option!");
        }
    }

    private static void printCheckoutBookResult(Book selectedBook, String checkoutOption) {
        if (checkoutOption.equals("Y") && !selectedBook.isCheckout()) {
            selectedBook.setCheckout(true);
            print("Thank you! Enjoy the book.");
        } else if (checkoutOption.equals("N")) {
            print("Thank you!");
        } else {
            print("That book is not available.");
        }
    }

    private static String getCheckoutOption() {
        return scanner.nextLine();
    }

    private static void printSelectedBookDetails(Book selectedBook) {
        if (selectedBook == null)
            print("Select a valid book!");
        else {
            print("****** Book Details ******");
            print("Book Name: " + selectedBook.getName());
            print("Book Author: " + selectedBook.getAuthor());
            print("Book Year Published: " + selectedBook.getYear());
            print("Book Checkout state: " + selectedBook.isCheckout());
        }
    }

    private static String getSelectedOption() {
        print("Please select option:");
        return scanner.nextLine();
    }

    private static int getSelectedBookId() {
        print("Please select number of the book:");
        return Integer.valueOf(scanner.nextLine());
    }

    private static void printBookListName() {
        print("****** Book List ******");
        for (Book book : books) {
            System.out.println(book.getId() + ". " + book.getName());
        }
    }

    static String welcome() {
        print("");
        return "****** Welcome Biblioteca ******";
    }

    static String printListBooksOptions() {
        return "List Books";
    }

    private static void print(String string) {
        System.out.println(string);
    }

    static String printQuitOptions() {
        return "Quit";
    }

    static String printCheckoutBook() {
        return "Would you like to checkout the book?Y/N";
    }
}
