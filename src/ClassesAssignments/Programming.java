package ClassesAssignments;

import java.util.Scanner;

public class Programming {

  static String message="I love ";

    Programming()
    {
        message.concat("Programming Languages");
    }

    Programming(String msg)
    {
        message.concat(msg);
    }

    public static void main(String[] args) {
        String  msg;
        String ch="Y";
        Programming p1;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("Enter Message:");
            msg=sc.next();
            if(msg.equals(""))
            {
                p1=new Programming();
            }
            else
                p1=new Programming(msg);

            p1.message.concat(" ");
            System.out.println("DO you want to continue:");
            ch= sc.next();

        }while(!ch.equals("N"));

        System.out.println(p1.message);

    }
}
