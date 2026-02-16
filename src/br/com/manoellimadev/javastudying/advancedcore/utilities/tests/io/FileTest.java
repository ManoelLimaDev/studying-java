package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("isCreated: " + isCreated);
            System.out.println("Exists: " + file.exists());
            System.out.println("Path: " + file.getPath());
            System.out.println("Abs. Path: " + file.getAbsolutePath());
            System.out.println("isFile: " + file.isFile());
            System.out.println("isDirectory: " + file.isDirectory());
            System.out.println("Last Modified: " + new Date(file.lastModified()).toInstant());
//            boolean isDeleted = file.delete();
//            System.out.println("isDeleted: " + isDeleted);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
