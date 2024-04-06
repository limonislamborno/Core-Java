
package vowelconsonantcheck;

import java.util.Scanner;


public class VowelConsonantCheck {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Pls enter any letter");
        char char1=sc.next().charAt(0);
        char char2=Character.toLowerCase(char1);
        
        if(char2=='a' || char2=='e' || char2=='i' || char2=='o' || char2=='u'){
            System.out.println("Vowel");
   
        }
        else{
            System.out.println("Consonant");
    }
        
        
        
    }
    
}
