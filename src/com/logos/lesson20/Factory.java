package com.logos.lesson20;

import lombok.SneakyThrows;

import java.util.Deque;
import java.util.Random;

public class Factory implements Runnable {
    Deque<Integer> list;
    Integer integer;

    public Factory(Deque<Integer> list) {
        this.list = list;
    }


    public Factory(Integer integer) {
        this.integer = integer;
    }

    public void produce(){
        list.push(new Random().nextInt(100));
    }

    public void incrementInteger(){
        int i = integer;
        i++;
        Thread.yield();
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
            produce();
            System.out.println(list);
        }
    }
}
