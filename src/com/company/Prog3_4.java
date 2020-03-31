package com.company;

import java.util.Scanner;

public class Prog3_4 {

    public static void main(String[] args) {

                int num =0, sum = 0;

                System.out.println("Enter a no:");
                Scanner sc=new Scanner(System.in);
                num=sc.nextInt();
                for(int i = 1; i <= num; ++i)
                {
                     sum += i;
                }

                System.out.println("Sum = " + sum);


    }
}
