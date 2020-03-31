package com.company;

import java.util.Scanner;
public class Digit_Sum
{
    static  int countdigit(long m)
    {
        int Count=0;
        while(m > 0) {
            m = m / 10;
            Count = Count + 1;
        }
        return Count;
    }
    public static void main(String args[])
    {
        long m,  sum = 0;
        int Count=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextLong();
        Count=countdigit(m);

        while (m != 0) {
            sum += m % 10;
            m /= 10;
        }

        System.out.println("Count:"+Count);
        System.out.println("Sum of Digits:"+sum);
    }
}