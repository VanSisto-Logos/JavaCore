package com.logos.lesson13.comparators;

import com.logos.lesson13.User;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o, User t1) {
        return o.getAge() - t1.getAge();
    }
}
