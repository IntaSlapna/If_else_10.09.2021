package com.company;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);

        System.out.println("The day of year: ");
        int dayNumber = scanner.nextInt();
        cal.set(Calendar.DAY_OF_YEAR, dayNumber);
        System.out.println("It is: " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));

    }
}
