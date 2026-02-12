package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

import java.io.File;
import java.io.IOException;

public class AccessDeniedTest {
    public static void main(String[] args) {
        File file = new File("FilesTest/Test001.txt"); //Linux
//      File file = new File("FilesTest\\Test001.txt"); //Windows
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created? " + isCreated);
        } catch (IOException e) { //Access Denied Exception
            e.printStackTrace();
        }
    }
}
