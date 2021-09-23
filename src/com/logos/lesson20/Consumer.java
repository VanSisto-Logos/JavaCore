package com.logos.lesson20;

import lombok.SneakyThrows;

import java.util.Deque;
import java.util.Random;

public class Consumer implements Runnable {
    Deque<Integer> list;
    Integer integer;

    public Consumer(Deque<Integer> list) {
        this.list = list;
    }


    public Consumer(Integer integer) {
        this.integer = integer;
    }

    public Integer consume(){
        return list.poll();
    }

    public void incrementInteger(){
        int i = integer;
        i++;
        integer = i;
    }

    @SneakyThrows
    @Override
    public void run() {

//        for (int i = 0; i < 10000; i++) {
//            incrementInteger();
//            System.out.println(integer);
//        }

        while (true){
            Thread.sleep(new Random().nextInt(2000));
            if (list.isEmpty()) System.out.println("Empty");
            else {
                consume();
                System.out.println(list);
            }
        }
    }
}
