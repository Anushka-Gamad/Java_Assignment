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
        }
    }
}


