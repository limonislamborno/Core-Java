
package unaryoperator;


public class UnaryOperator {

  
    public static void main(String[] args) {
       
        int x=25;
        int y;
        
        y=--x;          //25-1=24
        System.out.println("Y ="+y);
        
        y=x--;          //24        24-1=23 kore rakhbe
        System.out.println("Y ="+y);
        
        y=++x;          //23+1=24   
        System.out.println("Y ="+y);
        
        y=x++;          //24        24+1=25 kore rakhbe
        System.out.println("Y ="+y);
        
        
        
    }
    
}
