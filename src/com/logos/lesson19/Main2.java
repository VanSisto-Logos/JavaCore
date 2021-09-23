package com.logos.lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class Main2 {
    public static void main(String[] args) throws Exception {
//        File file = new File("file.txt");
//        System.out.println(file.canExecute());
//        System.out.println(file.getUsableSpace());
//        System.out.println(file.lastModified());
//
//        InputStream inputStream = new FileInputStream(file);

        RandomAccessFile file = new RandomAccessFile("file.txt", "rw");
        file.seek(file.length());


    }
}
