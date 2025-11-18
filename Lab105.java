import javax.swing.*;

public class Lab105 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Summation number = " + (2+5) +
                "\nSubtraction number = " + (2-5) +
                "\nMultiplicaton number = " + (2*5) +
                "\nDivision number = " + (2/5.0) +
                "\nModules number =" +(2%5)
                ,
                "Arithmetic Oerators",
                JOptionPane.WARNING_MESSAGE);
    }
}
