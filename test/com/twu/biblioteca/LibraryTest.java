package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @Test
    public void test_print_checkout_book() throws Exception {
        assertEquals("Would you like to checkout the book?Y/N", library.printCheckoutBook());
    }

    @Test
    public void test_print_return_book() throws Exception {
        assertEquals("* Return book *", library.printReturnBook());
    }
}
