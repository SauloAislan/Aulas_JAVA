package com.sauloaislan.javacore.Uio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderTest {
    public static void main(String[] args) {
        File file = new File("file+test.txt");
        try (FileWriter fw = new FileWriter(file, true);
             FileReader fr = new FileReader(file);) {

            fw.write("Escrevendo no file \n pulo a linha 4 \n");
            fw.flush();

            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " +size);
            for(char c : in){
                System.out.print(c);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
