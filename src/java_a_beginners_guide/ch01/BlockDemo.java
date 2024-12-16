package java_a_beginners_guide.ch01;

public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;

        if (i != 0) { // start of code block
            System.out.println("i doesn't equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        } // end of code block
    }
}
