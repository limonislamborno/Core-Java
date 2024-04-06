
package testobjectstreamforarray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestObjectStreamForArray {

   
    public static void main(String[] args) {
        
        int[] numbers={10,20,30,40,50};
       String[] gretings={"Hello", "Welcome","Bye","Good night"};
        
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\user\\Desktop\\array.dat");
            
            ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
            
            objectOutput.writeObject(numbers);
            objectOutput.writeObject(gretings);
             
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\user\\Desktop\\array.dat");
            ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
            
            int[] newNumbers= (int[]) inputStream.readObject();
            String[] newGretings= (String[]) inputStream.readObject();
            
            System.out.println(Arrays.toString(newNumbers));
            System.out.println(Arrays.toString(newGretings));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
}
