package inheeitencetest;

import phone.AndroidPhone;

public class InheeitenceTest {

    public static void main(String[] args) {

        AndroidPhone ap = new AndroidPhone();

        ap.setCall("Video call");
        ap.setMessage("MMS");
        ap.setOs("Android");
        ap.setStore("Play Store");

        ap.printDetails(); //Super
        System.out.println("");
        ap.printDet(); // sub

    }

}
