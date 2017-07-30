package com.twu.biblioteca;

public class User {
    private String id, name, email, phoneNumber, password;

    public User(String id, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    void printUserInformation() {
        Tools.print("User name: "+ name);
        Tools.print("User email address: "+ email);
        Tools.print("User phone number: "+ phoneNumber);
    }
}

