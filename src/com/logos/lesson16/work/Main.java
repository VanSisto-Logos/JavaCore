package com.logos.lesson16.work;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.print("Enter class: ");
        answer = scanner.next();

        Class clazz = Class.forName(answer);
        Object o = clazz.newInstance();

        Method[] methods = o.getClass().getDeclaredMethods();
        System.out.println(Arrays.toString(methods));


        System.out.print("Which method will be call? : ");
        int choiceMethod = scanner.nextInt();

        Class[] types = methods[choiceMethod].getParameterTypes();

        if (types.length == 2) {
            int[] data = new int[types.length];
            for (int i = 0; i < types.length; i++){
                System.out.print("arg" + i + " = ");
                data[i] = scanner.nextInt();
            }

            methods[0].invoke(o, data[0], data[1]);
        }
        else if (types.length == 0){
            methods[1].setAccessible(true);
            methods[1].invoke(o);
        }
    }


}
