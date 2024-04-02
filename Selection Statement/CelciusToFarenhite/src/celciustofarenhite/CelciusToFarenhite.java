
package celciustofarenhite;

import java.util.Scanner;


public class CelciusToFarenhite {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Pls enter temperature in celcius");
        double temperature=sc.nextInt();
        
        double farenhiteResult=((1.8)*temperature)+32;
        System.out.println(temperature+" Degree celcius = "+farenhiteResult+" Degree farenhite");
        
   
        
    }
    
}
