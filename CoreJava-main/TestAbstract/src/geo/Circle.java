package geo;

import java.util.Date;

public class Circle extends GeomatryObject {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled, Date date) {
        super(color, filled, date);
        this.radius = radius;
    }

    
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;

        return area;
    }

    @Override
    public double getPerimeter() {

        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
