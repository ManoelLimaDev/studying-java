package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NotDirectoryException;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileAlreadyExistsException | NotDirectoryException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void test() throws FileAlreadyExistsException, NotDirectoryException, IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException("Index Out Of Bounds Exception!!!");
//        throw new NotDirectoryException("Index Out Of Bounds Exception!!!");
//        throw new FileAlreadyExistsException("Index Out Of Bounds Exception!!!");

    }

}
