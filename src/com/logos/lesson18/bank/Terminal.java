package com.logos.lesson18.bank;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Terminal {
    Scanner scanner = new Scanner(System.in);

    public void run(UserService userService){
        while (true){
            System.out.println("1. Show tax \n2. Add user\n 3.Add account to user\n4. Print all");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("For which user: ");
                    choice = scanner.nextInt();

                    User user = null;

                    for (Map.Entry<User, List<Account>> e : userService.getUsersDB().getUsers().entrySet()){
                        if (e.getKey().getId() == choice) {
                            user = e.getKey();
                            System.out.println(e.getValue());
                        }
                    }

                    System.out.print("Choose account ");
                    choice = scanner.nextInt();
                    Account account = userService.usersDB.getUsers().get(user).get(choice);
                    System.out.println(userService.getTaxCalculatorForAccount().calculateTaxFor(account));

                    break;
                case 2:
                    System.out.print("Enter id: ");
                    long id = scanner.nextLong();
                    System.out.print("Enter name: ");
                    String name = scanner.next();

                    userService.addUser(new User(id, name));
                    break;
                case 3:
                    System.out.print("Choose user: ");
                    int index = scanner.nextInt();
                    System.out.println("Type of account:\n1. Debit\n2. Credit");
                    choice = scanner.nextInt();
                    Account account1 = null;

                    System.out.print("Enter id: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Enter money: ");
                    double money = scanner.nextDouble();

                    if (choice == 1) {
                        account1 = new DebitAccount(String.valueOf(id1), money);
                    } else if (choice == 2){
                        account1 = new CreditAccount(id1, money);
                    }

                    User forUser = null;

                    for (Map.Entry<User, List<Account>> e : userService.getUsersDB().getUsers().entrySet()){
                        if (e.getKey().getId() == index) {
                            forUser = e.getKey();
                            System.out.println(e.getValue());
                        }
                    }


                    userService.addAccountFor(forUser, account1);
                    break;
                case 4:
                    System.out.println(userService.getUsersDB().getUsers());

                    break;
            }
        }
    }
}
