package com.twu.biblioteca;

import com.twu.biblioteca.Movie;

import java.util.ArrayList;
import java.util.List;

class MovieManager {
    List<Movie> initMovieList(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, 2, "肖申克的救赎", "1994", "Frank"));
        movies.add(new Movie(2, 1, "这个杀手不太冷", "1994", "Luc"));
        movies.add(new Movie(3, 7, "阿甘正传", "1994", "Robert"));
        movies.add(new Movie(4, 3, "美丽人生", "1997", "Roberto"));
        movies.add(new Movie(5, 9, "千与千寻", "2001", "Hayao"));
        movies.add(new Movie(6, 6, "盗梦空间", "2010", "Christopher"));
        return movies;
    }

    Movie findMovieById(List<Movie> movies, int movieId) {
        for (Movie m : movies) {
            if (m.getId() == movieId) {
                return m;
            }
        }
        return null;
    }

    List<String> getMovieNameList(List<Movie> movies) {
        List<String> movieNameList = new ArrayList<>();
        for (Movie movie : movies) {
            movieNameList.add(movie.getName());
        }
        return movieNameList;
    }
}


