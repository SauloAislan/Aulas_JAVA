package com.sauloaislan.javacore.Rstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Saulo";
        nome = nome.concat(" Silva");

        String test = "Gato";
        String test2 = "     ANIMAL";
        String test3 = "12346";
        System.out.println(test.charAt(1));
        System.out.println(test.equals(test2));
        System.out.println(test.equalsIgnoreCase(test2));
        System.out.println(test.length());
        System.out.println(test.replace('o', 'a'));
        System.out.println(test2.toLowerCase());
        System.out.println(test.toUpperCase());
        System.out.println(test3.substring(0,3));
        System.out.println(test2.trim());
    }
}
