package com.company;

import java.util.Scanner;

//using inheritance
class AreaCalculation {
    double area;
    double volume;
    double circumference;
    double perimeter;

    void circle(double r) {
        area = (22 * r * r) / 7;
        circumference = (2 * r * 22) / 7;
    }
    void rectangle(double l, double b)
    {
        area = l*b;
        perimeter = 2*(l*b);
    }
    void triangle(double b, double h)
    {
        area = ((b*h)/2);
    }
    void square(double a)
    {
        area = a*a;
        perimeter = 4*a;
    }

}

class Shape extends AreaCalculation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect the shape to calculate area and perimeter:\n1.circle\n2.rectangle\n3.triangle\n4.square\n5.sphere\n6.cylinder\nTo end enter exit.");
            //int st = s.nextInt();
            String st = s.next();
            if (st.equals("circle")) {
                System.out.println("Enter the radius:");
                double rad = s.nextDouble();
                Shape a = new Shape();
                a.circle(rad);
                System.out.println("Area of Circle is: " + a.area);
                System.out.println("circumference of circle: " + a.circumference);
            }
            else if (st.equals("rectangle")) {
                System.out.println("enter length:");
                double l = s.nextDouble();
                System.out.println("enter breadth:");
                double b = s.nextDouble();
                Shape a = new Shape();
                a.rectangle(l, b);
                System.out.println("Area of rectangle is: " + a.area);
                System.out.println("Perimeter of rectangle is: " + a.perimeter);
            }
            else if (st.equals("triangle")) {
                System.out.println("enter base:");
                double b = s.nextDouble();
                System.out.println("enter height:");
                double h = s.nextDouble();
                Shape a = new Shape();
                a.triangle(b, h);
                System.out.println("Area of triangle is: " + a.area);
            }
            else if (st.equals("square")) {
                System.out.println("enter length of side:");
                double d = s.nextDouble();
                Shape a = new Shape();
                a.square(d);
                System.out.println("Area of square is: " + a.area);
                System.out.println("Perimeter of square is : " + a.perimeter);
            }
            
        }
    }
}


