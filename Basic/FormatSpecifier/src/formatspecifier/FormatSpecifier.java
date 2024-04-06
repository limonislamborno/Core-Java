package formatspecifier;

public class FormatSpecifier {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 233;
        int i = 1219;
        String st = "Limon";
        float f = 1.22f;
        double d = 4.444499;

        System.out.printf("boolean b=%b\n", b);
        System.out.printf("char c=%c\n", c);
        System.out.printf("short s=%d\n", s);
        System.out.printf("int i=%d\n", i);
        System.out.printf("string st=%s\n", st);
        System.out.printf("float f=%.2f\n", f);
        System.out.printf("double d=%.3f\n", d);

    }

}
