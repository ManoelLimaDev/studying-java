package br.com.manoellimadev.javastudying.advancedcore.utilities.tests;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        calendar.add(Calendar.DAY_OF_MONTH, 5);//add 5 days
        calendar.roll(Calendar.DAY_OF_MONTH, 5);//add 5 days, without add month/years

        System.out.println(calendar.getTime());
    }
}
