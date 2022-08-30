
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Object Oriented Programming (Paired)
 */

import javax.swing.JOptionPane;

public class SimpleCalculator {
    public static void main(String[] args) {
        Ownership.Introduction();

        String menu[] = { "Addition", "Subtraction", "Multiplication", "Division", "Square", "Exit" };

        String choice = JOptionPane.showInputDialog(null, "Choose operation: ", "Simple Calculator",
                JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]).toString();

        switch (choice) {
            case "Addition":
                add();
                break;

            case "Subtraction":
                subtract();
                break;

            case "Multiplication":
                multiply();
                break;

            case "Division":
                divide();
                break;

            case "Square":
                square();
                break;

            case "Exit":
                System.exit(0);
        }

    }

    public static void add() {
        int in1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter 1st addend: ", "Addition", JOptionPane.QUESTION_MESSAGE));
        int in2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter 2nd addend: ", "Addition", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "The combination of inputted addends are " + (in1 + in2), "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void subtract() {
        int in1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter minuend: ", "Subtraction", JOptionPane.QUESTION_MESSAGE));
        int in2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter subtrahend: ", "Subtraction", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "The difference is" + (in1 - in2), "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void multiply() {
        int in1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1st multiplicand: ", "Multiplication",
                JOptionPane.QUESTION_MESSAGE));
        int in2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 2nd multiplicand: ", "Multiplication",
                JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, in1 * in2, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void divide() {
        int in1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter dividend: ", "Division", JOptionPane.QUESTION_MESSAGE));
        int in2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter divisor: ", "Division", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "The quotient is " + (in1 / in2) + "with remainder " + (in1 % in2),
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void square() {
        int in1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter 1st number: ", "Square", JOptionPane.QUESTION_MESSAGE));
        int in2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter 2nd number: ", "Square", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,
                "The square of the first number is " + (in1 * in1) + " and " + (in2 * in2) + " for the second.",
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
