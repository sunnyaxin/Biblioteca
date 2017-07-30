package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    private static Library library = new Library();
    private static Theater theater = new Theater();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Tools.print(welcome());
            Tools.print(printListBooksOptions());
            Tools.print(printListMoviesOptions());
            Tools.print(printQuitOptions());
            String selectedOption = getSelectedOption();
            if (selectedOption.equals("Quit"))
                break;
            printDifferentOption(selectedOption);
        }
    }

    private static void printDifferentOption(String selectedOption) {
        if (selectedOption.equals("List Books")) {
            library.printLibraryMenu();
        } else if (selectedOption.equals("List Movies")) {
            theater.printTheaterMenu();
        } else {
            Tools.print("Select a valid option!");
        }
    }

    private static String getSelectedOption() {
        Tools.print("Please select option:");
        return scanner.nextLine();
    }

    static String welcome() {
        Tools.print("");
        return "****** Welcome Biblioteca ******";
    }

    static String printListBooksOptions() {
        return "List Books";
    }

    static String printQuitOptions() {
        return "Quit";
    }

    static String printListMoviesOptions() {
        return "List Movies";
    }
}
