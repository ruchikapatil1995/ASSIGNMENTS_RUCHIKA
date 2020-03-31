package com.company;

import java.util.Scanner;

public class LoopingDemo {

    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Enter a no:");
            num = sc.nextInt();

            if(num>0)
            {
                System.out.println("Good Going...");
                continue;
            }
            if(num<0)
            {
                System.out.println("Its Over...");
                break;
            }


        }while (true);


    }
}
