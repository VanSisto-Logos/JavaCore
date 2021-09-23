package com.logos.lesson20.codeTime;

import java.util.Deque;

public class Printer implements Runnable {
    Deque<String> buffer;

    public Printer(Deque<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (buffer.isEmpty()) {
            System.out.println("printer");
            if (!buffer.isEmpty()) {
                System.out.println(buffer);
                buffer.clear();
                Thread.yield();
            }
        }
    }
}
