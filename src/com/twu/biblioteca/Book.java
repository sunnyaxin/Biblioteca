package com.twu.biblioteca;

public class Book {
    private int id;
    private String name, author, year;
    private boolean checkout;

    Book(int id, String name, String author, String year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    boolean isCheckout() {
        return checkout;
    }

    void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    String getName() {
        return name;
    }

    String getYear() {
        return year;
    }

    String getAuthor() {
        return author;
    }

    int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id && name.equals(book.name) && author.equals(book.author) && year.equals(book.year);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year.hashCode();
        return result;
    }
}
