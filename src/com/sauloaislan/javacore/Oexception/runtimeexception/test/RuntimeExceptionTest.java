package com.sauloaislan.javacore.Oexception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
//        Object o = null;
////        int a = 10;
////        int b = 0;
////        if(b!=0) {
////            int c = a / b;
////            System.out.println(c);
////        }
//
//        try{
//            int[] a = new int[2];
//            System.out.println(a[2]);
//            System.out.println("Depois mas dentro do try");
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        System.out.println("Depois de tudo");
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void divisao(int num1, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Paasse um valor difete de 0");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
