package com.logos.lesson13;

import com.logos.lesson13.comparators.UserAgeComparator;
import com.logos.lesson13.comparators.UserNameAgeComparator;
import com.logos.lesson13.comparators.UserNameComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("Bill", 13);
        users[1] = new User("Bill", 23);
        users[2] = new User("Andrew", 16);

        Arrays.sort(users, new UserNameComparator());
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new UserAgeComparator());
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new UserNameAgeComparator());
        System.out.println(Arrays.toString(users));
    }
}

//linedList
//check remove
//lists comparator