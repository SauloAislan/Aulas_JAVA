package com.sauloaislan.javacore.Qwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'a';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'a';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isAlphabetic('9'));
        System.out.println(Character.charCount('d'));
    }
}
