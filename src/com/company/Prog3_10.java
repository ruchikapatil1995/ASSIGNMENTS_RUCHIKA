package com.company;

import java.util.Scanner;

public class Prog3_10 {

    public static void main(String[] args) {

        int num,c=1,spaces,i,j;
        System.out.print("Input number of rows: ");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        for(i=0;i<num;i++)
        {
            for(spaces=1;spaces<=num-i;spaces++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
