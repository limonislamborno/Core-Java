
package pkg2darray;


public class Main {

   
    public static void main(String[] args) {
       int [][] number=new int[4][5];
       int k=0;
       for(int i=0; i<4; i++){
       for(int j=0; j<5; j++){
           number[i][j]=k;
           k++;
       }
       
       }
       //printing matrix
       for(int i=0; i<4; i++){
           for(int j=0; j<5; j++){
               System.out.print(" \t"+number[i][j]);
           }
           System.out.println("");

       }
        
        
        
    }
    
}
