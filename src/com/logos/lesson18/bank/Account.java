package com.logos.lesson18.bank;

import lombok.ToString;

@ToString
public abstract class Account<T> {
    private T id;
    private double money;

    public void setId(T id) {
        this.id = id;
    }

    public T getId(){
        return id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(T id, double money) {
        this.id = id;
        this.money = money;
    }
}
