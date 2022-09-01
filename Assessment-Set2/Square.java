import javax.swing.JOptionPane;

public class Square {
    public static void main(String[] args) {
        Ownership.Introduction();

        int intValue;
        double input = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Enter number: ", "Square", JOptionPane.QUESTION_MESSAGE));
        if (input % 1 == 0) {
            intValue = (int) input;
            JOptionPane.showMessageDialog(null, square(intValue), "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, square(input), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static int square(int x) {
        return x * x;
    }

    public static double square(double x) {
        return Math.pow(x, 2);
    }
}
