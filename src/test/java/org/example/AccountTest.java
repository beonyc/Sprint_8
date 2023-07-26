package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    String validName = "Yura Sugrobov";
    String inValidNameLessThen3Characters = "Y S";
    String inValidNameMoreThen19Characters = "Yura Sugroboviiiiich";
    String inValidNameWithoutSpace = "YuraSugrobov";

    Account account;

    @Test

    public void checkIfNameIsValidTest() {
        account = new Account(validName);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkIfNameIsInValidWhenLessThen3LengthTest() {
        account = new Account(inValidNameLessThen3Characters);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkIfNameIsInValidWhenMoreThan19LengthTest() {
        account = new Account(inValidNameMoreThen19Characters);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkIfNameIsInValidWithoutSpaceTest() {
        account = new Account(inValidNameWithoutSpace);
        assertFalse(account.checkNameToEmboss());
    }

}