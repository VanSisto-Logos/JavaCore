package com.logos.lesson22.optional;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
