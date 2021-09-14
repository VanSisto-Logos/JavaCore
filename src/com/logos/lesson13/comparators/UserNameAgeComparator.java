package com.logos.lesson13.comparators;

import com.logos.lesson13.User;

import java.util.Comparator;

public class UserNameAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o, User t1) {
        if (o.getName().compareTo(t1.getName()) == 0) {
            return o.getAge() - t1.getAge();
        }
        return o.getName().compareTo(t1.getName());
    }
}
