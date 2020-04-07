package ClassesAssignments;
import java.util.Scanner;
class AddAmount
{
    static double amount=50;
    static int count=0;
    AddAmount()
    {
        //no amount added   count++;
    }
    AddAmount(double value)
    {
        amount+=value;
        count++;
    }
}

public class SavingBox
{

    public static void main(String[] args) {
        double amount;
        AddAmount a1;
        String ch="Y";
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter amount to be deposited:");
            amount=sc.nextDouble();

            a1=new AddAmount(amount);
            System.out.println("DO you want to continue:");
            ch= sc.next();

        }while(!ch.equals("N"));
        System.out.println("Amount :"+a1.amount);
        System.out.println("No of Transactions :"+a1.count);
    }

}
