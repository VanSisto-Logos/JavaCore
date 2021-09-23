package com.logos.lesson19.objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("User_user.javaobj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

        User newUser = new User();
        newUser.setId(1l);
        newUser.setName("Name1");
        Passport passport = new Passport();
        passport.setId(534534l);
        newUser.setPassport(passport);

        objectOutputStream.writeObject(newUser);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        User user = (User) objectInputStream.readObject();
        System.out.println(user);

    }
}
