package com.logos;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLRead {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new URL("https://www.promarinetrade.com/cache/promarine/public/shop_product_picture/_1200x800x0/4618_G.jpg").openStream();

        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());

        System.out.println(inputStream.available());
    }
}
