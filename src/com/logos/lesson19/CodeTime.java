package com.logos.lesson19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class CodeTime {
    public static void main(String[] args) throws Exception {
        Person person = new Person();


        FileInputStream fileInputStream = new FileInputStream("person.txt");
        StringBuilder stringBuilder = new StringBuilder();

        while (fileInputStream.available() > 0) {
            stringBuilder.append((char)fileInputStream.read());
        }

        String[] pers = stringBuilder.toString().split(" ");

        person.setName(pers[0]);
        person.setAge(Integer.valueOf(pers[1]));

        System.out.println(person);

        new FileOutputStream("person2.txt").write((person.getName() + " " + person.getAge()).getBytes());

        BufferedReader bufferedReader = new BufferedReader(new FileReader("person.txt"));
        System.out.println(bufferedReader.readLine());


    }
}
