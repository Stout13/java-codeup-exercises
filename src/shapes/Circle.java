package shapes;

import java.util.Scanner;

public class Circle {
    double pi = Math.PI;
    private double radius;

    public Circle(double radius1) {
        radius = radius1;
    }
    public static void main(String[] args) {
        Circle round = new Circle(13);
    }
    public void setRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the integer for the length of radius of the circle");
        this.radius = scanner.nextInt();
    }
    public double getArea() {
        //        System.out.println("welcome " + name);
        return pi*(radius*radius);
    }
    public double getRadius() {
        return this.radius;
    }
}


//Circle class
//
//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle. This class should have a private radius field that is set through the constructor, and various methods for getting information about the circle, detailed below.
//
//
//public Circle(double radius)
//public double getArea()
//public double getCircumference()
//        Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using
//        your Input class, creates a Circle object, and displays the circumference and area.
//        (Note that you will need to import your Input class.)
//
//        The formulas for the circumference and area:
//
//
//        circumference = 2 x pi x radius
//        area = pi x (radius ^ 2)
//        For the value of pi, use the PI constant of the Math class.
