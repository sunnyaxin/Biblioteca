package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
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
    public void test_print_options_list_movies() throws Exception {
        assertEquals("List Movies", BibliotecaApp.printListMoviesOptions());
    }

    @Test
    public void test_print_options_user_information() throws Exception {
        assertEquals("User Information", BibliotecaApp.printUserInformationOptions());
    }
}


