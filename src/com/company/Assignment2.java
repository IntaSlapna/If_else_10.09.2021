package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        short time = 30;
        if (time < 12) {
            System.out.println("Good Morning, Sunshine!");
        } else if ((time >= 13) && (time <= 19)) {
            System.out.println("Good Afternoon. Work hard!");
        } else if ((time >= 20) && (time <= 24)) {
            System.out.println("Good evening. Get some rest!");
        } else if (time > 24) {
            System.out.println("Error");
        }
    }
}
