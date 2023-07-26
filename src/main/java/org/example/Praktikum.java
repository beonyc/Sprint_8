package org.example;

public class Praktikum {
    public static void main(String[] args) {

        Account account=new Account("Тимоти Шаламе");
        Account account2=new Account("ТимотиШаламе");
        System.out.println(account.checkNameToEmboss());
        System.out.println(account2.checkNameToEmboss());
    }
}
