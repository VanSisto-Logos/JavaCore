package com.logos.lesson19.context;

public class AnotherClass {
    Context context = Context.getContext();

    public void fillData(){
        context.getDatabase().getIntegers().add(6);
        context.getDatabase().getIntegers().add(7);
    }


    public void showUser(){
        System.out.println(context.getUser());
    }
}
