package com.logos.lesson23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        list.stream()
//                .map()
//                .filter()
//                .distinct()
//                .findAny();

        Stream stream = Stream.of("a", "b", "c");

        String[] strings = new String[4];
        Arrays.stream(strings);

        IntStream intStream = "String".chars();
        intStream.forEach(System.out::println);

        Stream.builder()
                .add("A")
                .add("B")
                .add("C")
                .add("D")
                .build()
                .forEach(System.out::println);

//        Stream infiniteStream = Stream.iterate(1, i -> ++i).limit(1000);
//        infiniteStream.forEach(System.out::println);
            Stream.generate(() -> "fdsa").limit(5).forEach(System.out::println);



    }
}
