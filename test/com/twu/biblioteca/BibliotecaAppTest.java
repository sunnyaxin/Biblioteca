package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void test_welcome_message() throws Exception {
        assertEquals("****** Welcome Biblioteca ******", BibliotecaApp.welcome());
    }

}
