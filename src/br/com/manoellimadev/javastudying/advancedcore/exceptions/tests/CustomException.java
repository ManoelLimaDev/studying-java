package br.com.manoellimadev.javastudying.advancedcore.exceptions.tests;

import java.io.IOException;

public class CustomException extends IOException {

    public CustomException() {
        super("\nThis is a custom Exception\n");
    }

    public CustomException(String msg){
        super(msg);
    }
}
