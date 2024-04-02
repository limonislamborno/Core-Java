package studentmanagementsystem;

import education.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class StudentManagementSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Student student = new Student();
        Student[] students = {
            new Student("Limon Islam", 29),
            new Student("K. M. Saifullah", 28),
            new Student("Rajib Al Ahmed", 29)
        };

        FileOutputStream fileOutputStream = new FileOutputStream("Data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(students);

        FileInputStream fileInputStream = new FileInputStream("Data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student[] newStudents = (Student[]) objectInputStream.readObject();

        System.out.println(Arrays.toString(newStudents));

    }
}
