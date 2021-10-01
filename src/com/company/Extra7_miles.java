package com.company;

public class Extra7_miles {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10));

    }

    public static double toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour/1.609;

        if (kilometersPerHour >= 0)
            return (long) Math.round(milesPerHour);
        else return -1;


    }

}
