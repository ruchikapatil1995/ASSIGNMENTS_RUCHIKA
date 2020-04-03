package StringAssignments;
import java.util.Scanner;
public class Prog5_3 {
        public static void main(String[] args)
        {
            System.out.println("Enter a string:");
            Scanner sc=new Scanner(System.in);
            String str = sc.nextLine();


            str = str.replaceAll("\\s", "");

            System.out.println(str);
        }
    }

