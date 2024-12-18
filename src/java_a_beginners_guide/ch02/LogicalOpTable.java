package java_a_beginners_guide.ch02;

public class LogicalOpTable {
    public static void main(String[] args) {
        int p, q, c;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1;
        q = 1;
        c = (p == 0) ? 1 : 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (c));

        p = 1;
        q = 0;
        c = (p == 0) ? 1 : 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (c));

        p = 0;
        q = 1;
        c = (p == 0) ? 1 : 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (c));

        p = 0;
        q = 0;
        c = (p == 0) ? 1 : 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (c));

    }

}
