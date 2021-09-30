package com.logos.lesson23;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) throws Exception {
        List<String> stringList = new LinkedList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("One");
        stringList.add("Six");

        System.out.println(stringList.stream()
                .filter(s -> s.contains("One"))
                .count());

        System.out.println(stringList.stream()
                .findFirst()
                .orElse("0"));

        System.out.println(stringList.stream()
                .sorted(String::lastIndexOf)
                .findFirst()
                .get());

        System.out.println(Stream.of()
                .reduce((c, n) -> c == null ? "empty" : n)
                .orElseGet(() -> "empty"));

        System.out.println(stringList.stream()
                .reduce((c, n) -> n)
                .get());

        stringList.stream()
                .filter(s -> s.equals("Three"))
                .findFirst()
                .orElseThrow(Exception::new);

        System.out.println(stringList.stream()
                .limit(3)
                .sorted(String::lastIndexOf)
                .findFirst()
                .get());

        stringList.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println();
        stringList.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println(stringList.stream()
                .anyMatch(s -> s.contains("One")));

        System.out.println();
        System.out.println(stringList.stream()
                .allMatch(s -> s.contains("o")));

        System.out.println();
        List<String> list = stringList.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        System.out.println(list);




    }
}
