
package geo;

public class Student {
    
    private int id;
    private String name;
    private String email;
    private String cell; 

    public Student() {
    }

    public Student(int id, String name, String email, String cell) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cell = cell;
    }

    public Student(String name, String cell) {
        this.name = name;
        this.cell = cell;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
            
    public  void printStuInfo(){
        
        System.out.println(name + " "+ email + " "+ cell );
      
    }
}
 