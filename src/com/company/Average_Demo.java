package com.company;

public class Average_Demo {

    public static void main(String[] args) {

        int a=10,b=20,c=30;
        long average;

        average=(a+b+c)/3;

        System.out.println("Average is:"+average);

        if(average>a && average>b && average >c)
        {
            System.out.println("Average is higher than a,b,c");
        }
        else if(average>a && average>b )
        {
            System.out.println("Average is higher than a,b");
        }
        else if(average>a && average>c )
        {
            System.out.println("Average is higher than a,c");
        }
        else if(average>b && average>c)
        {
            System.out.println("Average is higher than b,c");
        }
        else if(average>a )
        {
            System.out.println("Average is higher than a");
        }
        else if(average>b )
        {
            System.out.println("Average is higher than b");
        }
        else if(average>c )
        {
            System.out.println("Average is higher than c");
        }
    }
}
