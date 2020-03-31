package com.company;

import java.util.Scanner;

public class Mathematical_Opn {

    public static void main(String[] args) {

        int x=0,y=0,operation,ex,x1=0,y1=0;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice from the following menu:");
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Average  6. Exit");
            operation = sc.nextInt();
            if(operation!=6){

                System.out.println("Enter the first number");
                x=sc.nextInt();
                System.out.println("Enter the second number");
                y=sc.nextInt();


                if (operation==5)
                {

                    System.out.println("Enter the third number");
                    x1=sc.nextInt();
                    System.out.println("Enter the fourth number");
                    y1=sc.nextInt();
                }
            }
            else
                break;
            switch(operation)
            {
                case 1:System.out.println("Addition of "+x+" and "+y+" is "+(x+y));
                    break;
                case 2:System.out.println("Subtraction of "+x+" and "+y+" is "+(x-y));
                    break;
                case 3:System.out.println("Division of "+x+" and "+y+" is "+(x/y));
                    break;
                case 4: System.out.println("Multiplication of "+x+" and "+y+" is "+(x*y));
                    break;
                case 5: System.out.println("Average is "+((x+y+x1+y1)/2));
                    break;

                case 6 : break;

                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue?1.Yes 2.No");
            ex=sc.nextInt();
        }while(ex==1);
    }
}
