import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Input minutes:","Input",JOptionPane.QUESTION_MESSAGE);
        int minutes = Integer.parseInt(input);
        int hour = minutes / 60;
        int minute = minutes % 60;
        String message = minutes + "minutes is " + hour + "hour " + minute + "minute";
        JOptionPane.showMessageDialog(null,message);
    }
}
