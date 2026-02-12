package br.com.manoellimadev.javastudying.advancedcore.utilities.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String regex = "bingo";
        String text = "dosaijdsabingodosiadjsaibingodoaijsdkasbingodpsadka";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text: " + text);
        System.out.println("Regex: " + regex);

        System.out.print("Position matched:");
        while (matcher.find()) {
            System.out.print(" " + matcher.start());
        }
    }
}
