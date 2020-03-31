package com.company;

import java.util.Scanner;

public class Prog3_7 {

        private static Scanner sc;
        public static void main(String[] args)
        {
            int month,year;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter Month Number from 1 to 12  : ");
            month = sc.nextInt();

            System.out.print(" Please Enter Year  : ");
            year=sc.nextInt();

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
            {
                System.out.println("\n 31 Days in this Month");
            }
            else if ( month == 4 || month == 6 || month == 9 || month == 11 )
            {
                System.out.println("\n 30 Days in this Month");
            }
            else if ( month == 2 )
            {
                if ( year % 4 == 0)
                    System.out.println("\n 29 Days in this Month");
                else
                    System.out.println("\n 28 Days in this Month");
            }
            else
                System.out.println("\n Please enter Valid Number between 1 to 12");
        }
    }

