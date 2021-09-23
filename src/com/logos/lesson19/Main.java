package com.logos.lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("file.txt");
        System.out.println(inputStream.available());

        StringBuilder stringBuilder = new StringBuilder();

        while (inputStream.available() > 0) {
            stringBuilder.append((char)inputStream.read());
        }
        inputStream.close();

        String[] lines = stringBuilder.toString().split("\n");
        int[] values = new int[lines.length];
        for (int i = 0; i < lines.length; i++){
            values[i] = Integer.valueOf(lines[i]);
        }

        int summ = 0;
        for (int i : values){
            summ += i;
        }

        stringBuilder.append("\n" + summ);


        OutputStream outputStream = new FileOutputStream("file.txt");

        outputStream.write(stringBuilder.toString().getBytes());
        outputStream.close();


        System.out.println(stringBuilder.toString());

    }
}
