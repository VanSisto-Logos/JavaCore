package com.logos.lesson20.codeTime;

import java.util.Deque;
import java.util.Scanner;

public class Input implements Runnable {
    Deque<String> buffer;
    Scanner scanner = new Scanner(System.in);

    public Input(Deque<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        synchronized (buffer){
                buffer.push(scanner.next());
                Thread.yield();
        }
    }
}
