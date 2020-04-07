package ClassesAssignments;
import java.util.*;
public class Student {
    int rollno;
    String sname;
    Student()
    {
        rollno=111;
        sname="Unknown";
    }

    Student(int rollno,String sname)
    {
        this.sname=sname;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        int rollno;
        String sname;
        Scanner sc=new Scanner(System.in);
        Student s1;
        System.out.println("Enter Student ROll no:");
        rollno=sc.nextInt();
        System.out.println("Enter Student Name:");
        sname=sc.next();

        if(sname=="")
        {
            s1=new Student();
        }
        else
        {
            s1=new Student(rollno,sname);
        }

        System.out.println("ROll No:"+s1.rollno+"Name:"+s1.sname);

    }

}
