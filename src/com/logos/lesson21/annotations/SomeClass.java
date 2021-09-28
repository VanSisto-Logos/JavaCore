package com.logos.lesson21.annotations;

@MyAnn("class")
public class SomeClass {

    @MyAnn("a")
    int ai;

    @MyAnn("fdsa")
    public void method(){
        System.out.println("Parent");
    }
}
