package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDir = new File("test");
        boolean isDirCreated = fileDir.mkdir();
        System.out.println("Directory Created: " + isDirCreated);

        File fileFile = new File(fileDir, "test.txt");//fileDir has the path
        File fileRenamed = new File(fileDir, "sofisticated_test.txt");
        File dirRenamed = new File("sofisticated tests");

        try {
            boolean isFileCreated = fileFile.createNewFile();
            System.out.println("File Created: " + isFileCreated);

        } catch (IOException e) {
            e.printStackTrace();
        }

        if(fileFile.exists()) System.out.println("FILENAME ALREADY TAKEN");
        else{
            boolean isFileRenamed = fileFile.renameTo(fileRenamed);
            System.out.println("File Renamed: " + isFileRenamed);
        }
        if (fileRenamed.exists()) System.out.println("DIRECTORY NAME ALREADY TAKEN");
        else {
            boolean isDirRenamed = fileDir.renameTo(dirRenamed);
            System.out.println("Directory Renamed: " + isDirRenamed);
        }
    }
}
