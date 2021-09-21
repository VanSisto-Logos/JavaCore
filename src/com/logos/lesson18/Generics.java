package com.logos.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Generics<T extends Number & Comparable> {

    List db = new ArrayList();

    public String toString(T a){
        return String.valueOf(a);
    }

    public T getOb(T a){
        return a;
    }

}

