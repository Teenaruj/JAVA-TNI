import javax.swing.*;

public class Lab306 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter an Integer number:","Input",JOptionPane.QUESTION_MESSAGE);
        int n = Integer.parseInt(input);
        long sum = 0;
        for (int i = 1; i <= n; i++) {sum += i;}
        JOptionPane.showMessageDialog(null,"Summation of 1 to  " + n + " is" + sum,"Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
