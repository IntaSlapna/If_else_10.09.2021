package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        //int day = 9;
        //int month = 10;
        //int year = 1993;

        // if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0 && year <= 2021)
        //     System.out.println(year + "/" + month + "/" + day);
        //else System.out.println("Wrong format");

        Scanner scan = new Scanner(System.in);
        System.out.println("Day of birth: ");
        int day = scan.nextInt();
        System.out.println("Month of birth: ");
        int month = scan.nextInt();
        System.out.println("Year of birth: ");
        int year = scan.nextInt();
        System.out.println("Please select the formating - 1 for YYYY/MM/DD, 2 for YYYY.MM.DD: ");
        int formating = scan.nextInt();
        if (formating == 1)
            System.out.println(year + "/" + month + "/" + day);
        else if (formating == 2)
            System.out.println(year + "." + month + "." + day);
        else System.out.println("Wrong formating code");


    }
}

