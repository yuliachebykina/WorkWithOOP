package info.sjd.model;

public abstract class AbstractShape implements Shape, Comparable<Shape> {

    private String className = "Abstract shape";
    public abstract double getArea () ;

    @Override
    public String toString() {
        return "Abstract shape";
    }
}
