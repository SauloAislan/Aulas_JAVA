package com.sauloaislan.javacore.Rstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma Franse comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma Franse comum");
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(4,"_"));
    }
}
