package com.logos.lesson16.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.logos.lesson16.test.User");
        Object o = clazz.newInstance();

        User u = null;

        if (o instanceof User) u = (User) o;

        System.out.println(Arrays.toString(u.getClass().getDeclaredMethods()));
        System.out.println(Arrays.toString(u.getClass().getDeclaredFields()));
        Constructor[] constructors = u.getClass().getConstructors();
        System.out.println(Arrays.toString(constructors));

        User u1= (User) constructors[1].newInstance();

        System.out.println(u1.getName());
        Method[] methods = u1.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        methods[1].setAccessible(true);
        System.out.println(methods[1].invoke(u1, 1));
        System.out.println(u1.getAge());

    }
}
