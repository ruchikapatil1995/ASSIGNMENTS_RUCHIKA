package com.company;

import java.util.Scanner;

public class Prog3_9 {

    public static void main(String[] args) {

        int num=0;


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a no:");
        num=sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(""+j);

            }
            System.out.print("\n");
        }
    }
}
