package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

class BookManager {

    Book findBookById(int bookId) {
        for (Book b : BibliotecaApp.books) {
            if (b.getId() == bookId) {
                return b;
            }
        }
        return null;
    }

    List<String> getBookNameList(List<Book> books) {
        List<String> bookNameList = new ArrayList<>();
        for (Book book : books) {
            bookNameList.add(book.getName());
        }
        return bookNameList;
    }

    List<Book> initBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "追风筝的人", "卡勒德·胡赛尼", "2006"));
        books.add(new Book(2, "小王子", "圣埃克苏佩里", "2003"));
        books.add(new Book(3, "围城", "钱钟书", "1991"));
        books.add(new Book(4, "解忧杂货店", "东野圭吾", "2014"));
        books.add(new Book(5, "活着", "余华", "1998"));
        books.add(new Book(6, "白夜行", "东野圭吾", "2008"));
        books.add(new Book(7, "挪威的森林", "村上春树", "2001"));
        books.add(new Book(8, "三体", "刘慈欣", "2008"));
        return books;
    }

}
