package com.sauloaislan.javacore.Uio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo_Test.txt");
        try {
            boolean newFile = file.createNewFile();
//            System.out.println(newFile);
            System.out.println("Premssão de Leitura? "+file.canRead());
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("É um diretorio? "+file.isDirectory());
            System.out.println("É oculto "+file.isHidden());
            System.out.println("Quando foi modificado? "+new Date(file.lastModified()));

            if (file.exists()){
                System.out.println("Deletado? "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
