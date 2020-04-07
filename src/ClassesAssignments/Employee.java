package ClassesAssignments;
import java.util.*;
class EmployeeDemo {
    int id;
    String name;
    String addr;

}

class Employee {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of employees :");
        int n = sc.nextInt();

        EmployeeDemo emp[] = new EmployeeDemo[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new EmployeeDemo();

            System.out.println("\nEnter " + (i + 1) + " EmployeeDemo data :");

            System.out.print("\nEnter EmployeeDemo id :");
            emp[i].id = sc.nextInt();
            System.out.print("\nEnter EmployeeDemo name :");
            emp[i].name = sc.next();
            System.out.print("\nEnter EmployeeDemo Address :");
            emp[i].addr = sc.nextLine();

        }

        System.out.println("\n\n============ Employee============\n");

        for (int i = 0; i < n; i++) {
            System.out.println("EmployeeDemo id  name and address :" + emp[0].id + " " + emp[i].name + " " + emp[i].addr);

        }
    }

}