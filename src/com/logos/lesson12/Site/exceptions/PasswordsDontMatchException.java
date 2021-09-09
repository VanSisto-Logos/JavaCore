package com.logos.lesson12.Site.exceptions;

public class PasswordsDontMatchException extends RuntimeException {
    public PasswordsDontMatchException() {
        super("Passwords dont match. Try again");
    }
}
