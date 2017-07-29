package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private List<Book> books;
    private BookManager bookManager;


    @Before
    public void setUp() throws Exception {
        bookManager = new BookManager();
        books = bookManager.initBookList();
    }
    @Test
    public void test_welcome_message() throws Exception {
        assertEquals("****** Welcome Biblioteca ******", BibliotecaApp.welcome());
    }

    @Test
    public void test_print_options_list_books() throws Exception {
        assertEquals("List Books", BibliotecaApp.printListBooksOptions());
    }

    @Test
    public void test_print_options_quit() throws Exception {
        assertEquals("Quit", BibliotecaApp.printQuitOptions());
    }

    @Test
    public void test_print_checkout_book() throws Exception {
        assertEquals("Would you like to checkout the book?Y/N", BibliotecaApp.printCheckoutBook());
    }
}
