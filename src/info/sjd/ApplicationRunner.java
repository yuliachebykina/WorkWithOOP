package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Square;
import info.sjd.model.Triangle;
import info.sjd.model.Shape;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        Shape square1 = new Square(10);
        Shape square2 = new Square(20);
        Shape square3 = new Square(30);
        Shape square4 = new Square(50);
        Shape square5 = new Square(10);
        Shape circle = new Circle(20);
        Shape triangle = new Triangle(100,100);

        Shape[] shapes = new Shape [7];

        shapes[0] = square1;
        shapes[1] = square2;
        shapes[2] = square3;
        shapes[3] = square4;
        shapes[4] = square5;
        shapes[5] = circle;
        shapes[6] = triangle;

        Shape maxShape = shapes[0];

        for (int i = 0; i < shapes.length; i++) {
            if (maxShape.getArea() < shapes[i].getArea()){
                maxShape = shapes[i];
            }
            logger.info("Max shape has area " + maxShape.getArea() + maxShape.getArea() + " and is " + maxShape.getClass().getSimpleName());
        }
    }
}