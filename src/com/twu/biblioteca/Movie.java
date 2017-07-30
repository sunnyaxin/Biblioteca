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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != movie.id) return false;
        if (rating != movie.rating) return false;
        if (!name.equals(movie.name)) return false;
        if (!year.equals(movie.year)) return false;
        return director.equals(movie.director);
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
