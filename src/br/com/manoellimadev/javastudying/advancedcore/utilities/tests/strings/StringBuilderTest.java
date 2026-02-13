package br.com.manoellimadev.javastudying.advancedcore.utilities.tests.strings;

public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Manoel");
        sb.append(" Araújo").append(" Lima").append("Neto");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(3, "HIHIHI");
        System.out.println(sb);
        sb.repeat("BLABLA", 2);//Repeat the string n times at the end
        System.out.println(sb);
        sb.delete(3, 15);
        System.out.println(sb);
        sb = new StringBuilder("Manoel Araújo Lima Neto");
        System.out.println(sb);
    }
}
