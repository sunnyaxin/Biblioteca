package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    private static Library library = new Library();
    private static Theater theater = new Theater();
    private static User user;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        user = new User("123-1234", "Sunny", "123456789@pp.com", "1234567890", "123321");
        while (true) {
            Tools.print(welcome());
            Tools.print(printListBooksOptions());
            Tools.print(printListMoviesOptions());
            Tools.print(printUserInformationOptions());
            Tools.print(printQuitOptions());
            String selectedOption = getSelectedOption();
            if (selectedOption.equals("Quit"))
                break;
            printDifferentOption(selectedOption);
        }
    }

    private static void printDifferentOption(String selectedOption) {
        switch (selectedOption) {
            case "List Books":
                library.printLibraryMenu();
                break;
            case "List Movies":
                theater.printTheaterMenu();
                break;
            case "User Information":
                user.printUserInformation();
                break;
            default:
                Tools.print("Select a valid option!");
                break;
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

    static String printUserInformationOptions() {
        return "User Information";
    }
}
