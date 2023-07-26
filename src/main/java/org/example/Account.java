package org.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.trim().length() > 3 && name.trim().length() < 19 && name.trim().contains(" ");
    }
}
