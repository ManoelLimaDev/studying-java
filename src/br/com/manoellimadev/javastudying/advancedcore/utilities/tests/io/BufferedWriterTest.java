package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try (FileWriter fw = new FileWriter(file, true); //(file, append)
             BufferedWriter bw = new BufferedWriter(fw)) {      //BufferedWriter has better performance

            bw.write("BLABLABLA");
            bw.newLine();   //New Line based on the used OS
            bw.write("BLEBLEBLE");
            bw.newLine();
            bw.write("BLULBULBLU");
            bw.newLine();

            bw.flush();//To Strings don't get stuck in the buffer

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
