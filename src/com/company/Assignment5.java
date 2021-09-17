package com.company;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner hours = new Scanner(System.in);
        System.out.println("Enter the number of working hours for today - ");
        int workingHoursInDay = hours.nextInt();
        if (workingHoursInDay >= 0 && workingHoursInDay <= 8)
            System.out.println("Your Salary is " + 10 * workingHoursInDay + " EUR");
        else if (workingHoursInDay > 8 && workingHoursInDay <= 24)
            System.out.println("Your Salary is " + (80 + (workingHoursInDay - 8) * 15) + " EUR");
        else System.out.println("Error");
    }

}
