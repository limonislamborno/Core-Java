
package escapesequence;


public class EscapeSequence {

  
    public static void main(String[] args) {
      String name1="Limon Islam Borno";
      int ageL=20;
      
      String  name2="Samapti Nandi";
      int ageS=16;
      
        System.out.println("My name is "+name1+"\t age is "+ageL);      //create a tab by \t
        System.out.println("My name is "+name2+"\n age is "+ageS);      //create new line by \n
        System.out.println("My gf name is "+"\""+name2+"\"");           //create a double qoute by \"
        System.out.println("My gf name is "+"\'"+name2+"\'");           //create a double qoute by \'
        System.out.println("My gf name is "+"\\"+name2+"\\");           //create a double qoute by \\
        
        
        int a=11;
        int b=420;
        int c=33;
        int d=44;
        
        System.out.println(b+"\b"); //create a backspace by \b
  
        
    }
    
}
