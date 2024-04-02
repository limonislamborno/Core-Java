package oop;

public class OOP {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setInformation("Samapti Nandi", "Female", "Chittagong", 20);
        teacher1.printDetails();

        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Limon Islam Borno", "Male", "Faridpur", 21);

        teacher2.printDetails();

    }

}
