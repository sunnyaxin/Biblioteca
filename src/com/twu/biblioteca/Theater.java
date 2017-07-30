package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

class Theater {

    private Scanner scanner = new Scanner(System.in);
    private MovieManager movieManager = new MovieManager();
    private List<Movie> movies = movieManager.initMovieList();

    void printTheaterMenu() {
        printMovieListName();
    }

    private void printMovieListName() {
        Tools.print("****** Movie List ******");
        for (Movie movie : movies) {
            if (!movie.isCheckout())
                System.out.println(movie.getId() + ". " + movie.getName());
        }
    }

}
