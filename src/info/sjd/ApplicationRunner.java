package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Square;
import info.sjd.model.Triangle;
import info.sjd.model.Shape;

import java.util.logging.Logger;


public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        Shape square = new Square(20);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,20);

        Shape maxShape = square;

        if (maxShape.getArea() < circle.getArea()){
            maxShape = circle;
        }
        if (maxShape.getArea() < triangle.getArea()){
            maxShape = triangle;
        }

        logger.info("Max shape has area " + maxShape.getArea() + maxShape.getArea() + " and is " + maxShape.getClass().getSimpleName());

    }
}