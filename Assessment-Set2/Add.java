/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Object Oriented Programming (Paired)
 */

public class Add {
    public static void main(String[] args) {
        Ownership.Introduction();

        add(1, 2.5);
        add(2.5, 1);
        add(1, 2);
        add(1.5, 2.5);

        System.out.println();
    }

    public static void add(int in1, double in2) {
        System.out.println("Int " + in1 + " + Double " + in2 + " = " + (in1 + in2));
    }

    public static void add(double in1, int in2) {
        System.out.println("Double " + in1 + " + Int " + in2 + " = " + (in1 + in2));
    }

    public static void add(int in1, int in2) {
        System.out.println("Int " + in1 + " + Int " + in2 + " = " + (in1 + in2));
    }

    public static void add(double in1, double in2) {
        System.out.println("Double " + in1 + " + Double " + in2 + " = " + (in1 + in2));
    }
}
