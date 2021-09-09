package com.logos.lesson12.Site.exceptions;

public class EmailIncorrectException extends Exception {
    public EmailIncorrectException(String s) {
        super("Email: " + s + " is incorrect");
    }
}
