package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioTest01 {
    public static void main(String[] args) throws IOException {
//        Path path01 = Paths.get("test/sofisticated tests");

        Path path01 = Paths.get("test/sub01/sub02/sub03");
        if(Files.notExists(path01)) {
//            Path pathDirectory = Files.createDirectory(path01);
            Path pathDirectory = Files.createDirectories(path01);
            System.out.println("Directory Created");
        }else{
            System.out.println("DIRECTORY ALREADY EXISTS");
        }

        Path filePath = Paths.get(path01.toString(), "test001.txt");
        if (Files.notExists(filePath)) {
            Path fileCreated = Files.createFile(filePath);
            System.out.println("File Created");
        }else {
            System.out.println("FILE ALREADY EXISTS");
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "renamed_test.txt");
//        if (Files.notExists(target)) {
//            Files.copy(source, target);
//            System.out.println("File Renamed");
//        }
//        else System.out.println("FILE NAME ALREADY TAKEN");
        Path pathCopiedFile = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
