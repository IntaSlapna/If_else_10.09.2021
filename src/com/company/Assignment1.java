package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        short numberOne = 4;
        short numberTwo = 10;
        if (numberOne == numberTwo) {
            System.out.println("Equal");
        } else if (numberOne > numberTwo) {
            System.out.println("Number One bigger");
        } else {
            System.out.println("Number Two bigger");
        }

        System.out.println("NumberOne is " + (numberOne % 2 != 0 ? "odd" : "even") + " and " + (numberOne < 0 ? "negative" : "positive") + " and " + (numberOne < 100 ? "less then 100" : "more then 100"));
        System.out.println("NumberTwo is " + (numberTwo % 2 != 0 ? "odd" : "even") + " and " + (numberTwo < 0 ? "negative" : "positive") + " and " + (numberTwo < 100 ? "less then 100" : "more then 100"));

    }
}