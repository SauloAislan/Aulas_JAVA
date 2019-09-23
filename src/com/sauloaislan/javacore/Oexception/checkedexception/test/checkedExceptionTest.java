package com.sauloaislan.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class checkedExceptionTest {
    public static void main(String[] args) {
//        try {
//            criarArquivo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("TEST.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo Criado!");
        }catch (IOException e){
            System.out.println("Não foi possivel criar o arquivo: "+ e);
            e.printStackTrace();
            throw e;
        }
    }

    public static void abrirArquivo() {
        File file = new File("TEST.txt");
        try {
//            file.createNewFile();
//            System.out.println("Arquivo Criado!" + file.createNewFile());
            System.out.println("Abrindo o arquivo");
            System.out.println("execuntando arquivo");
            throw new Exception();
//            System.out.println("escrevendo o arquivo");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o arquivo");
        }
    }
}
