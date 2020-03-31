package com.company;

import java.util.Scanner;

public class Prog2_1 {

    public static void main(String[] args) {

        int num=0;

        System.out.println("Enter a no:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%3==0)
            System.out.println("ConsultAdd");
        if(num%5==0)
            System.out.println("JAVA Training");
        if(num%5==0 && num%3==0)
            System.out.println("Consultadd JAVA Training");
    }
}
