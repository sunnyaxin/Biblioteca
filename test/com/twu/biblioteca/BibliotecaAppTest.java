package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private List<Book> books;

    @Before
    public void setUp() throws Exception {
        books = BibliotecaApp.initBookList();
    }

    @Test
    public void test_welcome_message() throws Exception {
        assertEquals("****** Welcome Biblioteca ******", BibliotecaApp.welcome());
    }

    @Test
    public void test_list_books() throws Exception {
        assertEquals(8, books.size());
        assertEquals(new Book("追风筝的人", "卡勒德·胡赛尼", "2006"), books.get(0));
        assertEquals(new Book("小王子", "圣埃克苏佩里", "2003"), books.get(1));
        assertEquals(new Book("三体", "刘慈欣", "2008"), books.get(7));
    }

    @Test
    public void test_list_books_name() throws Exception {
        assertEquals(Arrays.asList("追风筝的人","小王子", "围城","解忧杂货店","活着","白夜行","挪威的森林","三体"),
                BibliotecaApp.getBookNameList(books));
    }
}
