import javax.swing.*;

public class TimeConverter {
    public static void main(String[] args) {
        int sec = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter amount of seconds\t: ", "Seconds Converter",
                JOptionPane.QUESTION_MESSAGE));
        convert(sec);
    }

    public static void convert(int sec) {
        int hrs = sec / 3600;
        int mns = (sec % 3600) / 60;
        sec = (sec % 3600) % 60;

        String str = hrs + " hours, " + mns + " minutes, and " + sec + " seconds.";
        JOptionPane.showMessageDialog(null, str, "Seconds Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}
