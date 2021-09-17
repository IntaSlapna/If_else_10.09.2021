package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.DAY_OF_YEAR, 364);
        System.out.println("The day of year: ");
        int Daynumber = scanner.nextInt();
        // EDGAR, es nesaprotu, ká sakonektét Daynumber ar today, jo viens ir cipars, bet galá jábút ménesim ar várdiem
        //HELP
        String today;
        today = cal.getDisplayName(Calendar.MONTH);
        System.out.println("The month is " + today);
    }
}
