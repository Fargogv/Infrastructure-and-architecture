package ru.yandex.praktikum;

public class Main {
    public static void main(String[] args) {
        Account accountOne = new Account("Тимоти Шаламе");
        accountOne.checkNameToEmboss();
        Account accountTwo = new Account("ТимотейШевроле");
        accountTwo.checkNameToEmboss();
    }
}
