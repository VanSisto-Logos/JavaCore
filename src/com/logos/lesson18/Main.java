package com.logos.lesson18;

import com.logos.lesson18.bank.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, List<Integer>> integerListMap = new HashMap<>();
//        integerListMap.put(1, new ArrayList<>());
//        integerListMap.get(1).add(55);
//        integerListMap.get(1).add(65);
//        integerListMap.get(1).add(75);
//
//        System.out.println(integerListMap.get(1));
//        System.out.println(integerListMap.get(1).get(1));
//

        met(new String("fdsa"));


        UserService userService = new UserService();

        User user = new User(2l, "Bill");
        User user1 = new User(3l, "John");

        userService.addUser(user);
        userService.addAccountFor(user, new DebitAccount("id1", 1000));
        userService.addAccountFor(user, new CreditAccount(1, 2000));

        userService.addUser(user1);
        userService.addAccountFor(user1, new DebitAccount("id1", 61000));
        userService.addAccountFor(user1, new CreditAccount(1, 62000));


        new Terminal().run(userService);
    }


    public static  <S> void met(S a) {
        System.out.println(a);
    }
}
