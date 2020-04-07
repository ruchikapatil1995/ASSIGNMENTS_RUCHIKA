package ClassesAssignments;

public class Rectangle {

    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle()
    {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double side)
    {
        this.length = side;
        this.breadth = side;
    }

    double getArea()
    {
        return length * breadth;
    }


        public static void main(String arg[])
        {
            Rectangle rect = new Rectangle(10, 5);

            System.out.println("Length = " + rect.length);
            System.out.println("Breadth = " + rect.breadth);
            System.out.println("Area = " + rect.getArea());
        }
    }
