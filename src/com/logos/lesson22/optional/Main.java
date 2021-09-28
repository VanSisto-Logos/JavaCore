package com.logos.lesson22.optional;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        Person person = new Person();
        person.name="dsa";
        Optional<Person> personOptional = Optional.ofNullable(person);
        Person person1 = personOptional.orElse(new Person());
        System.out.println(person1);

        Optional<Person> emptyPerson = Optional.empty();
        System.out.println(emptyPerson.isPresent());
        Person person2 = emptyPerson.orElse(new Person());
        System.out.println(person2);

        Optional<Person> personOptional1 = Optional.ofNullable(null);
        Person person3 = personOptional1.orElseGet(() -> {
            String name = "name";
            return new Person(name);
        });

        System.out.println(person3);
        personOptional.orElseThrow(() -> new Exception());

        Person gettedPerson = personOptional.get();
        System.out.println(gettedPerson);

        Optional<Person> optional = Optional.of(new Person("Bill"));
        optional.ifPresent(p -> {
            p.setName("name2");
        });
        System.out.println(optional.get());

        Person person44 = optional.map(person4 -> {
            person4.setName("name4");
            return person4;
        }).get();
        System.out.println(person44);

        LinkedList<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(new Person("1", 3));
        personLinkedList.add(new Person("2", 5));
        personLinkedList.add(new Person("3", 7));
        personLinkedList.add(new Person("4", 9));

        System.out.println(personLinkedList);


        Optional<LinkedList<Person>> optionalPersonLinkedList = Optional.of(personLinkedList);
        Object[] people = optionalPersonLinkedList.map(l -> l.toArray()).get();
        System.out.println(Arrays.toString(people));

        Optional<Person> personOptional2 = Optional.of(new Person("name"));
//        Person person4 = personOptional2.map(p -> new Person(p.getName() + " name name ")).get();
        Person person4 = personOptional2.map(p -> {
            p.setName(p.getName() + "n n ");
            p.setAge(7);
            return p;
        }).get();
        System.out.println(person4);

        Person person5 = personOptional2.filter(p -> p.getAge() > 5).get();
        System.out.println(person5);

        personLinkedList = new LinkedList<>( personLinkedList.stream()
                .filter(p -> p.getAge() > 6)
                .map(p -> new Person(p.getName() + " " + p.getAge(), p.getAge()))
                .collect(Collectors.toList()) );
        System.out.println(personLinkedList);




    }
}
