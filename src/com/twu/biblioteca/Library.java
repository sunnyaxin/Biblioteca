package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

class Library {

    private Scanner scanner = new Scanner(System.in);
    private BookManager bookManager = new BookManager();
    private List<Book> books = bookManager.initBookList();

    void printLibraryMenu() {
        printBookListName();
        String bookListOption = getSelectedBookListOption();
        if (bookListOption.equals("Return book")) {
            returnBook();
        } else {
            selectBook(bookListOption);
        }
    }

    private void returnBook() {
        String bookName = getReturnBook();
        boolean findBook = false;
        for (Book book : books) {
            findBook = searchReturnBook(bookName, book);
            if (findBook) break;
        }
        if (!findBook)
            Tools.print("That is not a valid book to return.");
    }

    private void selectBook(String bookListOption) {
        Book selectedBook = bookManager.findBookById(books, Integer.valueOf(bookListOption));
        printSelectedBookDetails(selectedBook);
        Tools.print(printCheckoutBook());
        printCheckoutBookResult(selectedBook, getCheckoutOption());
    }

    private static boolean searchReturnBook(String bookName, Book book) {
        if (bookName.equals(book.getName()) && book.isCheckout()) {
            Tools.print("Thank you for returning the book.");
            book.setCheckout(false);
            return true;
        }
        return false;
    }

    private String getReturnBook() {
        Tools.print("Please input name of the return book:");
        return scanner.nextLine();
    }

    private static void printCheckoutBookResult(Book selectedBook, String checkoutOption) {
        if (checkoutOption.equals("Y") && !selectedBook.isCheckout()) {
            selectedBook.setCheckout(true);
            Tools.print("Thank you! Enjoy the book.");
        } else if (checkoutOption.equals("N")) {
            Tools.print("Thank you!");
        } else {
            Tools.print("That book is not available.");
        }
    }

    private String getCheckoutOption() {
        return scanner.nextLine();
    }

    private static void printSelectedBookDetails(Book selectedBook) {
        if (selectedBook == null)
            Tools.print("Select a valid book!");
        else {
            Tools.print("****** Book Details ******");
            Tools.print("Book Name: " + selectedBook.getName());
            Tools.print("Book Author: " + selectedBook.getAuthor());
            Tools.print("Book Year Published: " + selectedBook.getYear());
            Tools.print("Book Checkout state: " + selectedBook.isCheckout());
        }
    }

    private String getSelectedBookListOption() {
        Tools.print("Please select option or num of the book:");
        return scanner.nextLine();
    }

    private void printBookListName() {
        Tools.print("****** Book List ******");
        for (Book book : books) {
            if (!book.isCheckout())
                System.out.println(book.getId() + ". " + book.getName());
        }
        Tools.print(printReturnBook());
    }


    String printCheckoutBook() {
        return "Would you like to checkout the book?Y/N";
    }

    String printReturnBook() {
        return "* Return book *";
    }
}
