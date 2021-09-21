package com.logos.lesson18.bank;

import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class UserService {
    UsersDB usersDB = new UsersDB();
    TaxCalculatorForAccount taxCalculatorForAccount = new TaxCalculatorForAccount();

    public void showUsers(){
        for (Map.Entry<User, List<Account>> e : usersDB.getUsers().entrySet()){
            System.out.println(e);
        }
    }

    public void showAccountsFor(User user){
        for (Account a : usersDB.getUsers().get(user)){
            System.out.println(a);
        }
    }

    public void addUser(User user){
        usersDB.addUser(user);
    }

    public void addAccountFor(User user, Account account){
        usersDB.addAccountFor(user, account);
    }

}
