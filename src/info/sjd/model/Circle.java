package info.sjd.model;

public class Circle {

    public double radius;
    public double pi;

    public double getArea () {
        double area = pi*(radius*radius);
        return area;
    }
}
