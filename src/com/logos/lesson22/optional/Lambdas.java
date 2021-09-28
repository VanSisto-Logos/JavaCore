package com.logos.lesson22.optional;

public class Lambdas {
    public static void main(String[] args) {
//        MyLambda myLambda = str -> {
//            String summ = str + str;
//            System.out.println(summ);
//            return summ;
//        };

        MyLambda myLambda = () -> {
            System.out.println("random");
        };

        myLambda.getString();

//        myLambda.getString("some string");


    }
}