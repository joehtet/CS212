//*******************************************************************
// Joseph Htet - CS212 - Section C
// Homework 2
//*******************************************************************

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        Circle c = new Circle();
        Circle c2 = new Circle(1);
        c.setRadius(sc.nextDouble());
        


        System.out.println("Radius = " + c.getRadius());
        System.out.println("Area = " + c.getArea());
        System.out.println("Area = " + c.getArea());
        System.out.println("Area = " + c.getArea());
        System.out.println("Diameter = " + c.getDiameter());
        System.out.println("Circumference =" + c.getCircumference());

        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = =" );

        System.out.println("Radius = " + c2.getRadius());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Area = " + c2.getArea());
        System.out.println("Diameter = " + c2.getDiameter());
        System.out.println("Circumference =" + c2.getCircumference());
        

    }
}