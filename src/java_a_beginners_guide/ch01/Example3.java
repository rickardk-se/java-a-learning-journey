package java_a_beginners_guide.ch01;

public class Example3 {
    public static void main(String[] args) {
        int v;
        double x;

        v = 10;
        x = 10.0;

        System.out.println("The original value of v: " + v);
        System.out.println("The original value of x: " + x);

        System.out.println();

        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);
    }
}
