package geo;

public class Circle {

    private double radius;
    
    // create default constructor 
     public Circle() {
         
    }    
    // create argument constructor 
    public Circle(double radius) {
        this.radius = radius;
    }

     
    public void setRadius(double r) {

        if (r >= 1) {
            this.radius = r;
        } else {
            System.out.println("Pls enter a positive number");
        }

    }

    public double getArea() {
        double area = Math.PI * radius * radius;

        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
