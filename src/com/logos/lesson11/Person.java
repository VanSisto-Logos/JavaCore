package com.logos.lesson11;

import java.util.Objects;

public class Person {
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
