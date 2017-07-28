package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(welcome());

        List<Book> books = initBookList();
    }

    private static List<Book> initBookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("追风筝的人", "卡勒德·胡赛尼", "2006"));
        books.add(new Book("小王子", "圣埃克苏佩里", "2003"));
        books.add(new Book("围城", "钱钟书", "1991"));
        books.add(new Book("解忧杂货店", "东野圭吾", "2014"));
        books.add(new Book("活着", "余华", "1998"));
        books.add(new Book("白夜行", "东野圭吾", "2008"));
        books.add(new Book("挪威的森林", "村上春树", "2001"));
        books.add(new Book("三体", "刘慈欣", "2008"));
        return books;
    }

    static String welcome() {
        return "****** Welcome Biblioteca ******";
    }
}
