package ocp_java_se_21.ch01;

public class Swan {
    int numberEggs;

    public static void main(String[] args) {
        Swan myswan = new Swan();
        myswan.numberEggs = 10;
        System.out.println("I'm having " + myswan.numberEggs + " eggs in my basket.");
    }

}
