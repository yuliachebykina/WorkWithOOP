package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Square;
import info.sjd.model.Triangle;

public class ApplicationRunner {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 30.0;
        circle.pi = 3.14;
        System.out.println("1. Radius of circle is " + circle.radius);
        System.out.println("Area of circle is "+ circle.getArea());


        Square square = new Square();
        square.side = 10.0;
        System.out.println("2. Side of square is " + square.side);
        System.out.println("Area of square is " + square.getArea());

        Triangle triangle = new Triangle();
        triangle.base = 15.0;
        triangle.height = 10.0;
        System.out.println("3. Base of triangle is " + triangle.base + " and height of triangle is " + triangle.height);
        System.out.println("Area of triangle is " + triangle.getArea());

    }
}