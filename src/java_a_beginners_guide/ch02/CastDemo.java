package java_a_beginners_guide.ch02;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // no information loss
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // information loss
        System.out.println("Value of b: " + b);

        b = 88;
        ch = (char) b; // ASCII code for X, cast required
        System.out.println("ch: " + ch);

    }

}
