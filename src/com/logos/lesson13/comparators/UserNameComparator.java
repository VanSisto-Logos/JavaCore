package com.logos.lesson13.comparators;

import com.logos.lesson13.User;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {
    @Override
    public int compare(User o, User t1) {
        return o.getName().compareTo(t1.getName());
    }
}
