package java_a_beginners_guide.ch01;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 0; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++;

            if (counter == 10) {
                System.out.println(); // Print empty line
                counter = 0; // Reset counter
            }
        }
    }
}
