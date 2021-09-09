package com.logos.lesson12.Site;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terminal {
    LinkedList<User> db = new LinkedList<>();

    Scanner scanner = new Scanner(System.in);

    public void run(){
        while (true){
            System.out.println("Choose:\n1. Login\n2. Sign Up");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: login(); break;
                case 2: signUp(); break;
            }
        }
    }

    private void signUp() {
        String email = "";
        boolean emailIncorrect = true;
        while (emailIncorrect){
            System.out.print("Enter email: ");
            email = scanner.next();

            Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w{2,}");
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) emailIncorrect = false;
            else System.out.println("Email incorrect. Please try again.");
        }

        String password = "";
        String password2 = "";

        boolean matchPasswords = true;
        while (matchPasswords){
            System.out.print("Enter password: ");
            password = scanner.next();
            System.out.print("Confirm password: ");
            password2 = scanner.next();

            if (password.equals(password2)) matchPasswords = false;
            if (!password.equals(password2)) {
                System.out.println("Passwords don't match. Try again.");
                matchPasswords = true;
            }
        }

        db.add(new User(email, password));
    }

    private void login() {
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        User checkUser = new User(email, password);
        if (db.contains(checkUser)) {
            System.out.println("Logged in");
            System.exit(0);
        } else {
            System.out.println("Wrong data.");
        }

    }
}
