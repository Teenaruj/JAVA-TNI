import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        String w = JOptionPane.showInputDialog(null,"Enter your weight(kg.):", "Input", JOptionPane.QUESTION_MESSAGE);
        double weightKg = Double.parseDouble(w);
        String h = JOptionPane.showInputDialog(null,"Enter your height(cm.):", "Input", JOptionPane.QUESTION_MESSAGE);
        double heightCm = Double.parseDouble(h);
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        DecimalFormat df = new DecimalFormat("#0.00");
        String result;
        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 24.9) {
            result = "Healthy Weight";
        }else if (bmi < 29.9) {
            result = "Overweight";
        } else {
            result = "Obese";
        }
        JOptionPane.showMessageDialog(null, "Your BMI is " + df.format(bmi) + "\nBMI rsult is" + result,
                "Message",JOptionPane.INFORMATION_MESSAGE);
        }
    }
