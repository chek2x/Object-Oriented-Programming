
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Object Oriented Programming (Paired)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JButton bAdd, bSubtract, bMultiply, bDivide;
    JTextField field1, field2;
    JLabel result, enter1, enter2;

    Calculator() {
        setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();

        enter1 = new JLabel("1st: ");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 0;

        add(enter1, a);

        field1 = new JTextField(10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridy = 0;
        a.gridwidth = 3;
        add(field1, a);

        enter2 = new JLabel("2nd: ");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 1;
        add(enter2, a);

        field2 = new JTextField(10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridx = 1;
        add(field2, a);

        bAdd = new JButton("+");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 2;
        a.gridwidth = 1;
        add(bAdd, a);

        bSubtract = new JButton("-");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridy = 2;
        add(bSubtract, a);

        bMultiply = new JButton("*");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;
        a.gridy = 2;
        add(bMultiply, a);

        bDivide = new JButton("/");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;
        a.gridy = 2;
        add(bDivide, a);

        result = new JLabel("");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 4;
        a.gridwidth = 4;
        add(result, a);

        event e = new event();
        bAdd.addActionListener(e);
        bSubtract.addActionListener(e);
        bMultiply.addActionListener(e);
        bDivide.addActionListener(e);
    }

    class event implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            double number1, number2;

            try {
                number1 = Double.parseDouble(field1.getText());
            } catch (NumberFormatException e) {
                result.setText("Illegal data 1st Field");
                result.setForeground(Color.BLUE);
                return;
            }
            try {
                number2 = Double.parseDouble(field2.getText());
            } catch (NumberFormatException e) {
                result.setText("Illegal data 2nd Field");
                result.setForeground(Color.GREEN);
                return;
            }
            String op = a.getActionCommand(); // op for operator

            if (op.equals("+")) {
                double sum = number1 + number2;
                result.setText(number1 + "+" + number2 + "=" + sum);
                result.setForeground(Color.RED);
            }
            if (op.equals("-")) {
                double diff = number1 - number2;
                result.setText(number1 + "-" + number2 + "=" + diff);
                result.setForeground(Color.ORANGE);
            }
            if (op.equals("*")) {
                double product = number1 * number2;
                result.setText(number1 + "*" + number2 + "=" + product);
                result.setForeground(Color.GREEN);
            }
            if (op.equals("/")) {
                if (number2 == 0) {
                    result.setText("Cannot divide by zero");
                    result.setForeground(Color.RED);
                } else {
                    double quo = number1 / number2;
                    result.setText(number1 + "/" + number2 + "=" + quo);
                    result.setForeground(Color.BLUE);
                }
            }
        }
    }

    public static void main(String args[]) {
        Ownership.Introduction();

        Calculator calc = new Calculator();
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setTitle("Calculator");
        calc.setVisible(true);
        calc.setSize(200, 200);
    }
}