package com.logos.lesson18.bank;

public class TaxCalculatorForAccount {

    public double calculateTaxFor(Account account){
        return account.getMoney() * 0.05;
    }

}
