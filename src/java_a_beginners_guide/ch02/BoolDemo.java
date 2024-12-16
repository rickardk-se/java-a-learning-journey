package java_a_beginners_guide.ch02;

public class BoolDemo {
    public static void main(String[] args) {
        boolean f;

        f = false;
        System.out.println("f is " + f);

        f = true;
        if (f)
            System.out.println("f is now " + f);

        System.out.println("10 > 9 is: " + (10 > 9));
    }

}
