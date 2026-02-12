package br.com.manoellimadev.javastudying.advancedcore.utilities.tests;

public class StringTest {
    public static void main(String[] args) {
        String name = "Manoel";
        String name2 = "   Manoel";
        System.out.println(name == name2);//Compare memory location(String pool)

        System.out.println(name);
//        name.concat(" Lima");
        name = name.concat(" Lima"); // name += " Lima";
        System.out.println(name);

        String name3 = new String ("Manoel");
        System.out.println(name == name3);//Name3 is not in the String pool

        // --------------------------------------------------------------------------
        System.out.println(name.charAt(0)); //return 'M'
        System.out.println(name.length());  //return the String length
        System.out.println(name.replace("a", "x"));
        System.out.println(name.substring(0,3));
        System.out.println(name2);
        System.out.println(name2.trim());   //remove empty spaces
    }
}
