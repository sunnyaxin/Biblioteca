package com.twu.biblioteca;

public class Movie {
    private int id, rating;
    private String name, year, director;
    private boolean checkout;

    Movie(int id, int rating, String name, String year, String director) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.year = year;
        this.director = director;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    boolean isCheckout() {
        return checkout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return id == movie.id && rating == movie.rating && name.equals(movie.name) && year.equals(movie.year) && director.equals(movie.director);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + rating;
        result = 31 * result + name.hashCode();
        result = 31 * result + year.hashCode();
        result = 31 * result + director.hashCode();
        return result;
    }
}
