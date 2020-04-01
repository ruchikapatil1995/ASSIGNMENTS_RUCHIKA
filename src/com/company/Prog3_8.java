package com.company;

import java.util.Scanner;

public class Prog3_8 {

    public static void main(String[] args) {

        int year;
        Scanner sc=new Scanner(System.in);

        year=sc.nextInt();

        if ( year % 4 == 0)
            System.out.println("\n Leap Year");
        else
            System.out.println("\n Not a leap year");
    }

}
