package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try(FileWriter fw = new FileWriter(file, true)){//(file, append)

            fw.write("BLABLABLA\nBLEBLEBLE\nBLULBULBLU\n");
            fw.flush();//To Strings don't get stuck in the buffer

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
