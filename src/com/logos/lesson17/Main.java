package com.logos.lesson17;

import java.util.*;

public class Main {
    private static int var = 5;

    public static void outerMethod(){
        System.out.println(var);

    }

    public static class InnerClass {
        int var2 = 9;
    }





    public static void main(String[] args) {
        Main.InnerClass innerClass = new Main.InnerClass();


    }
}
