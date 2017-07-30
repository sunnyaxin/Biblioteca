package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

class Theater {

    private Scanner scanner = new Scanner(System.in);
    private MovieManager movieManager = new MovieManager();
    private List<Movie> movies = movieManager.initMovieList();

    void printTheaterMenu() {
        printMovieListName();
        Tools.print(printCheckoutOption());
        String movieListOption = getCheckoutMovie();
        if (movieListOption.equals("Y")) {
            Tools.print("CHECKOUT MOVIE...WAIT TO COMPLETE...");
        }
    }

    private void printMovieListName() {
        Tools.print("****** Movie List ******");
        for (Movie movie : movies) {
            if (!movie.isCheckout())
                System.out.println(movie.getId() + ". " + movie.getName());
        }
    }

    String printCheckoutOption() {
        return "*** Checkout movie ***";
    }

    private String getCheckoutMovie() {
        Tools.print("Would you like checkout any movie? Y/N");
        return scanner.nextLine();
    }
}
