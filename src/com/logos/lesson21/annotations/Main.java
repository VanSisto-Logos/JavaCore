package com.logos.lesson21.annotations;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {

        SomeClass2 someClass2 = new SomeClass2();
        System.out.println(someClass2);

        Class clazz = SomeClass.class;
        System.out.println(Arrays.toString(clazz.getDeclaredAnnotations()));

    }
}
