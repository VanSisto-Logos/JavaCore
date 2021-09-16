package com.logos.lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user = new User("A", 3);

        Map<Identifier, User> userMap = new HashMap<>();
        userMap.put(new Identifier(1), new User("Bill", 29));
        userMap.put(new Identifier(1), new User("Klint", 39));
        userMap.put(new Identifier(3), new User("Roland", 49));
        userMap.put(new Identifier(4), new User("Sam", 59));
        userMap.put(new Identifier(5), new User("Sam", 59));
        userMap.put(new Identifier(5), user);

        Identifier identifier = new Identifier(1l);

        userMap.remove(identifier);

        for (Map.Entry<Identifier, User> e : userMap.entrySet()){


            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        Set<Identifier> identifiers = userMap.keySet();
        identifiers.forEach(System.out::println);

        LinkedList<User> users = new LinkedList<>(userMap.values());
        users.forEach(System.out::println);


    }
}
