package ClassesAssignments;

import java.util.Scanner;

public class Complex{
    //for real and imaginary parts of complex numbers
    double real, img;

    //constructor to initialize the complex number
    Complex(double r, double i){
        this.real = r;
        this.img = i;
    }

    public String toComString(){
        //double x=this.real + this.imaginary;
        //return " "+x;

        return this.real+" + "+this.img+"i";
    }
    public static String sum(Complex c1, Complex c2)
    {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp.toComString();
    }
    public static String difference(Complex c1, Complex c2)
    {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;

        return temp.toComString();
    }
    public static String Product(Complex c1, Complex c2)
    {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real * c2.real;
        temp.img = c1.img * c2.img;

        return temp.toComString();
    }
    public static void main(String args[]) {
        Complex c1,c2;
        double real,img;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st complex no");
        System.out.println("Enter real:");
        real=sc.nextDouble();
        System.out.println("Enter img:");
        img=sc.nextDouble();
        c1= new Complex(real,img);
        System.out.println("Enter 2nd complex no");
        System.out.println("Enter real:");
        real=sc.nextDouble();
        System.out.println("Enter img:");
        img=sc.nextDouble();
        c2= new Complex(real,img);
     //   System.out.println("Number1:"+c1.real+"+"+c1.img);

        System.out.println("Addition:"+sum(c1,c2));
        System.out.println("Difference:"+difference(c1,c2));
        System.out.println("Product:"+Product(c1,c2));



    }
}