package com.logos.lesson19.context;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        terminal.showDatabase();

        AnotherClass anotherClass = new AnotherClass();
        anotherClass.fillData();

        terminal.showDatabase();

        terminal.showUser();
        anotherClass.showUser();


    }
}
