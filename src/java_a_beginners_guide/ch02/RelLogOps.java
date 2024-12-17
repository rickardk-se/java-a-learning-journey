package java_a_beginners_guide.ch02;

public class RelLogOps {
    public static void main(String[] args) {
        int i = 10, j = 11;
        boolean b1 = true, b2 = false;

        if (i < j)
            System.out.println("i < j");
        if (i <= j)
            System.out.println("i <= j");
        if (i != j)
            System.out.println("i != j");
        if (i == j)
            System.out.println("i == j"); // this won't execute
        if (i > j)
            System.out.println("i > j"); // this won't execute
        if (i >= j)
            System.out.println("i >= j"); // this won't execute

        if (b1 & b2)
            System.out.println("This won't execute"); // AND
        if (!(b1 & b2))
            System.out.println("!(b1 & b2 ) is " + (!(b1 & b2))); // NOT AND
        if (b1 | b2)
            System.out.println("b1 | b2 is " + (b1 | b2)); // OR
        if (b1 ^ b2)
            System.out.println("b1 ^ b2 is " + (b1 ^ b2)); // XOR

    }
}
