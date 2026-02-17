package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalization {
    public static void main(String[] args) {
        String directory = "test/sub01/sub02/sub03";
        String fileTxt = "/../../test002.txt";
        Path pathFile = Paths.get(directory, fileTxt);
        System.out.println(pathFile);
        System.out.println(pathFile.normalize());
    }
}
