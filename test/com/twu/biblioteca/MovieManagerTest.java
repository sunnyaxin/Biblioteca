package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieManagerTest {
    private List<Movie> movies;
    private MovieManager movieManager;

    @Before
    public void setUp() throws Exception {
        movieManager = new MovieManager();
        movies = movieManager.initMovieList();
    }

    @Test
    public void test_list_books() throws Exception {
        assertEquals(6, movies.size());
        assertEquals(new Movie(1, 2, "肖申克的救赎", "1994", "Frank"), movies.get(0));
        assertEquals(new Movie(2, 1, "这个杀手不太冷", "1994", "Luc"), movies.get(1));
        assertEquals(new Movie(6, 6, "盗梦空间", "2010", "Christopher"), movies.get(5));
    }
}
