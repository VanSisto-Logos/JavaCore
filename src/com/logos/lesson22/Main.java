package com.logos.lesson22;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        LinkedList list2 = new LinkedList();

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers.forEach(i -> {
            list2.add(i + 10);
            System.out.println(i);

        });

        integers.forEach(System.out::println);

        System.out.println(integers);
        System.out.println(list2);


    }
}

//https://www.baeldung.com/java-8-functional-interfaces