package com.logos.lesson19.context;

import lombok.Data;

@Data
public class Terminal {
    Context context = Context.getContext();

    public void showDatabase(){
        System.out.println(context.getDatabase());
    }

    public void showUser(){
        System.out.println(context.getUser());
    }
}
