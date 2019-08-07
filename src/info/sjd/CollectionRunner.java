package info.sjd;

import info.sjd.model.Circle;
import info.sjd.model.Shape;
import info.sjd.model.Square;
import info.sjd.model.Triangle;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class CollectionRunner {

    private static Logger logger = Logger.getLogger(CollectionRunner.class.getName());

    public static void main(String[] args) {

        Shape square1 = new Square(10);
        Shape square2 = new Square(20);
        Shape square3 = new Square(30);
        Shape square4 = new Square(40);
        Shape square5 = new Square(50);
        Shape circle = new Circle(10000);
        Shape triangle = new Triangle(10,10);


//        Queue

        Queue<Shape> shapeQueue = new PriorityQueue<>();
        shapeQueue.add(square1);
        shapeQueue.add(square2);
        shapeQueue.add(square3);
        shapeQueue.add(square4);
        shapeQueue.add(square5);
        shapeQueue.add(circle);
        shapeQueue.add(triangle);


        logger.info("Queue has size " + shapeQueue.size());
        Shape firstElement = shapeQueue.peek();
        logger.info("The first element is " + firstElement.getClass().getSimpleName() + " and has area " + firstElement.getArea());

        firstElement = shapeQueue.poll();
        logger.info("The first element is " + firstElement.getClass().getSimpleName() + " and has area " + firstElement.getArea());

        firstElement = shapeQueue.peek();
        logger.info("The first element is " + firstElement.getClass().getSimpleName() + " and has area " + firstElement.getArea());


//        Set


//        List

    }
}
