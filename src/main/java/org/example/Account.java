package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
@Step
@Description("валидация строки длина больше, длина меньше 19 и есть пробел между именем и фамилией")
    public boolean checkNameToEmboss() {
        return name.trim().length() > 3 && name.trim().length() < 19 && name.trim().contains(" ");
    }
}
