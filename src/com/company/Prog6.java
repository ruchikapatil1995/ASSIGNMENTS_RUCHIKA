package com.company;

import java.util.Scanner;

public class Prog6 {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        if (num%2!=0)
            System.out.println("NEW");
        else if(num>=2 && num<=5)
            System.out.println("OLD");
        else if(num>=6 && num<=30)
            System.out.println("NEW");
        else
            System.out.println("OLD");
    }
}
