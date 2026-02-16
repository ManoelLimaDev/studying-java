package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[5];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
