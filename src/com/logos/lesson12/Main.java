package com.logos.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

public class Main {
    public void run() {
        Integer[] integer = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < integer.length; i++){
            integer[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(integer));

        Arrays.sort(integer);

        System.out.println(Arrays.toString(integer));

        Arrays.sort(integer, Comparator.reverseOrder());

        System.out.println(Arrays.toString(integer));


        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.get(3);
        arrayList.add(3, 8);
        System.out.println(arrayList.toString());
        arrayList.remove(2);
        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(2));

        LinkedList<Integer> linkedList = new LinkedList<>();

    }
}
