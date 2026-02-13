package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest02 {
    public static void main(String[] args) {
//        String text = "0 0x 0X 0xABC9 0Xabcga1 0x1";
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // Regex to make hexadecimal numbers
        String text = "manoel@gmail.com.br, Pedro123@hotmail.com, 456Ma_ria-@yahoo.co";
        String regex = "([a-zA-Z0-9-_\\.])+@([a-zAz\\.])+([a-zA-z])";
//        String regex = "[^\\s]";
        System.out.println("Text:"+text+"\nRegex:"+regex);
        regexQuant(text, regex);
    }
    public static void regexQuant(String text, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.start() + " : " + matcher.group());
        }
    }
}
