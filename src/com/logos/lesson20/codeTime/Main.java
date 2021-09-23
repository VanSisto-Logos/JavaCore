package com.logos.lesson20.codeTime;

import com.logos.Threads;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> buffer = new ArrayDeque<>();
        new Thread(new Input(buffer)).start();
        new Thread(new Printer(buffer)).start();
    }
}
