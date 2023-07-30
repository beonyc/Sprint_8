package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    String validName = "Yura Sugrobov";
    String inValidNameLessThen3Characters = "Y S";
    String inValidNameMoreThen19Characters = "Yura Sugroboviiiiich";
    String inValidNameWithoutSpace = "YuraSugrobov";

    Account account;

    @Test
    @DisplayName("тест валиднйо строки")
    @Description("првоерка строки на соблюдение всех требование")
    public void checkIfNameIsValidTest() {
        account = new Account(validName);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("тест строки у которой длина меньше 3")
    @Description("првоерка строки длины меньше 3")
    public void checkIfNameIsInValidWhenLessThen3LengthTest() {
        account = new Account(inValidNameLessThen3Characters);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("тест строки у которой длина юольше 19")
    @Description("првоерка строки длины больше 19")
    public void checkIfNameIsInValidWhenMoreThan19LengthTest() {
        account = new Account(inValidNameMoreThen19Characters);
        assertFalse(account.checkNameToEmboss());
        //assertTrue(account.checkNameToEmboss());
        //pricold
    }

    @Test
    @DisplayName("тест строки у которой нет пробела между именем и фамилией")
    @Description("првоерка строки без пробела")
    public void checkIfNameIsInValidWithoutSpaceTest() {
        account = new Account(inValidNameWithoutSpace);
        assertFalse(account.checkNameToEmboss());
    }

}