
package genericktype;


public class GenerickType {

   
    public static void main(String[] args) {
       Box<Integer> intBox=new Box<>(24);
       int intValue= intBox.getValue();
       System.out.println(intValue);
       
       Box<String> stringBox=new Box<>("Limon");
       String stringValue= stringBox.getValue();
       System.out.println(stringValue);

        
        
        
        
    }
    
}
