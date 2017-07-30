package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {
    @Test
    public void test_checkout_movie() throws Exception {
        assertEquals("*** Checkout movie ***", new Theater().printCheckoutOption());
    }
}
