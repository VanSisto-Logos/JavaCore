package com.logos.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    Pattern pattern = Pattern.compile("Abc");
    Matcher matcher = pattern.matcher("fds fds adf 4 3wa Abch");

    public void reg(){
        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println(matcher.replaceAll("9999999999999"));
    }
}
