package com.example.booklendingsystem.Model;

public enum Role {
    USER,
    LIBRARIAN;

    public static Role fromString(String role) {
        switch (role) {
            case "user":
                return USER;
            case "librarian":
                return LIBRARIAN;
        }
        throw new RuntimeException("Type " + role + " isn't being handled");
    }

}