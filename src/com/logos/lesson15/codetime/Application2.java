package com.logos.lesson15.codetime;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Application2 {
    public static void main(String[] args) {
        Map<User, List<Account>> userAccountMap = new LinkedHashMap<>();

        User user = new User("Steve");
        User user1 = new User("Bill");
        User user2 = new User("John");

        userAccountMap.put(user, new ArrayList<>());
        userAccountMap.get(user).add(new Account("bla"));
        userAccountMap.get(user).add(new Account("bla1"));
        userAccountMap.get(user).add(new Account("bla2"));
        userAccountMap.get(user).add(new Account("bla3"));



        userAccountMap.remove(user1);
//
        for (Map.Entry<User, List<Account>> e : userAccountMap.entrySet()){
            System.out.println("User " + e.getKey() + " Account " + e.getValue());
            String val = e.getValue().get(0).getEmail();
            if (val.equals("bla")) System.out.println(e.getKey().getName());
        }

        // Створити персон, в яких є:
        // В 1 - смартфон і ноут
        // В 2 - ноут і смарт-годинник
        // В 3 - годинник
        // В 4 - годинник і ноут
        // Вивести імена тих персон, в яких є ноут



    }
}
