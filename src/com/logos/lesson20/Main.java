package com.logos.lesson20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer integer = new Integer(1);
        Deque<Integer> list = new ArrayDeque<>();

        Thread factory = new Thread(new Factory(list));
        Thread consumer = new Thread(new Consumer(list));

        factory.start();
        consumer.start();

//        Data data = new Data();
//
//
//        Thread thread1 = new Thread(new MyThread(data));
//        Thread thread2 = new Thread(new MyThread(data));
//
//        thread1.setName("thread0");
//
//        thread1.start();
//        thread2.start();
    }
}

class MyThread implements Runnable {
    Data data;

    public MyThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            inc();
        }
    }

    public void inc(){
        synchronized (data){
            int i = data.data;
            if (Thread.currentThread().getName().equals("thread0")) Thread.yield();
            i++;
            data.data = i;

            System.out.println(data.data + Thread.currentThread().getName());
        }
    }
}