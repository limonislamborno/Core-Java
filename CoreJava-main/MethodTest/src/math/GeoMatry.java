package math;

public class GeoMatry {

    public double circlesInRectangle(int length, int width, int radius) {
        double numberOfCircle = (length * width) / areaOfCircle(radius);
        System.out.println("run 1");
        return numberOfCircle;
    }

    public double areaOfCircle(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Run 2");
        return area;
    }
    
    
    public  int doSum(){
    
        return 10+20;
    }
    
    public  int doSum(int a, int b){
        return a+b;
    }
    
    public  int doSum(int a, int b, int c){
        return doSum(a, b)-c;
    }
    
    

}
