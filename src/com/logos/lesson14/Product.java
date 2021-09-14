package com.logos.lesson14;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private int number;

    public Product(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getNumber() == product.getNumber() &&
                getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return number - product.getNumber();
    }
}
