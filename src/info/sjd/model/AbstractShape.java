package info.sjd.model;

public abstract class AbstractShape {

    private String className = "Abstract shape";
    public abstract double getArea () ;

    @Override
    public String toString() {
        return "Abstract shape";
    }
}
