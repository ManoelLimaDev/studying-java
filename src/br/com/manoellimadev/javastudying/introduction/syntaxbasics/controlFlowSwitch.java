package br.com.manoellimadev.javastudying.introduction.syntaxbasics;

public class controlFlowSwitch {
    public static void main(String[] args) {
        int day = 3;
        System.out.println("The day number is: " + day);
        switch (day){
            case 1:
                System.out.println("Today is Sunday");
                break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednsday");
                break;

            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday");
                break;

            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Invalid day" + day);
                System.out.println("Pick a day between 1 and 7");
                break;
        }

    }
}
