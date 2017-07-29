package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookManagerTest {
    private List<Book> books;
    private BookManager bookManager;

    @Before
    public void setUp() throws Exception {
        bookManager = new BookManager();
        books = bookManager.initBookList();
    }

    @Test
    public void test_list_books() throws Exception {
        assertEquals(8, books.size());
        assertEquals(new Book(1, "追风筝的人", "卡勒德·胡赛尼", "2006"), books.get(0));
        assertEquals(new Book(2, "小王子", "圣埃克苏佩里", "2003"), books.get(1));
        assertEquals(new Book(8, "三体", "刘慈欣", "2008"), books.get(7));
    }

    @Test
    public void test_list_books_name() throws Exception {
        assertEquals(Arrays.asList("追风筝的人", "小王子", "围城", "解忧杂货店", "活着", "白夜行", "挪威的森林", "三体"),
                bookManager.getBookNameList(books));
    }

    @Test
    public void test_get_book_details_when_id_1() throws Exception {
        assertEquals("追风筝的人", bookManager.findBookById(books, 1).getName());
        assertEquals("卡勒德·胡赛尼", bookManager.findBookById(books, 1).getAuthor());
        assertEquals("2006", bookManager.findBookById(books, 1).getYear());
    }
}
