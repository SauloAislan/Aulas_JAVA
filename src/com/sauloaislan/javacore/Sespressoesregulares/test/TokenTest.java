package com.sauloaislan.javacore.Sespressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Saulo, Aislan, Bia, Manu, Rosilene, Maria, Josefa, Carla";
        String[] tokens = str.split(",");
        for(String arr : tokens)
            System.out.println(arr.trim());
    }
}
