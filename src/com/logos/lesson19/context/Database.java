package com.logos.lesson19.context;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Database {
    List<Integer> integers = new ArrayList<>();
    public Database(){
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
    }
}
