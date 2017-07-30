package com.twu.biblioteca;

public class Movie {
    private int id, rating;
    private String name, year, director;
    private boolean checkout;

    public Movie(int id, int rating, String name, String year, String director) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public boolean isCheckout() {
        return checkout;
    }
}
