package com.sauloaislan.javacore.Tresourceboundle.test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.LocaleServiceProvider;

public class ResouceBundlesTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");

        rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
    }
}
