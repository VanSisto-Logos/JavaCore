package com.logos.lesson15.codetime;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<User, Account> userAccountMap = new LinkedHashMap<>();

        User user = new User("Steve");
        User user1 = new User("Bill");
        User user2 = new User("John");

        userAccountMap.put(user, new Account("steve1"));
        userAccountMap.put(user, new Account("steve2"));
        userAccountMap.put(user1, new Account("bill1"));
        userAccountMap.put(user2, new Account("john1"));

        userAccountMap.remove(user, new Account("steve1"));
        userAccountMap.remove(user1);

        for (Map.Entry<User, Account> e : userAccountMap.entrySet()){
            System.out.println("User " + e.getKey() + " Account " + e.getValue());
        }


    }
}
