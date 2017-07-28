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
}
