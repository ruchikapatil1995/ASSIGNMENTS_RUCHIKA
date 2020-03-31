package com.company;

import java.util.Scanner;

public class Prog3_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0,avg=0;
        System.out.println("Enter 10 nos:");
        for (int i = 0; i < 10; i += 1){
            sum += input.nextInt();
        }
        avg=sum/10;
        System.out.println("The total sum is: " + sum );
        System.out.println("The Average is: " + avg );
    }

}
