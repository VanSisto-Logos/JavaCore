package com.logos.lesson18.bank;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class UsersDB {
    private Map<User, List<Account>> users = new TreeMap<>(new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public void addUser(User user) {
        users.put(user, new ArrayList<>());
    }

    public void addAccountFor(User user, Account account) {
        users.get(user).add(account);
    }

}
