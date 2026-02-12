package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile(){
        try(Reader reader = new BufferedReader(new FileReader("FilesTest/test.txt"))){//Needs to implement Closable or Autoclosable

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
