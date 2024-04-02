package oop;

public class Teacher {

    String name, address, gender;
    int age;

    void setInformation(String n, String g, String ad, int ag) {
        name = n;
        gender = g;
        address = ad;
        age = ag;

    }

    ;
    
    
    
    void printDetails() {
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Gender :" + gender);
        System.out.println("Age  :" + age);
        System.out.println("\n");

    }
;

}
