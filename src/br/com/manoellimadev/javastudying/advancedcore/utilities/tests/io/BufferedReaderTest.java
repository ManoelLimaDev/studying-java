package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
//            char[] in = new char[5];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
