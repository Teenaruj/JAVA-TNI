import javax.swing.JOptionPane;

public class Lab302 {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter your name:");


        String heightText = JOptionPane.showInputDialog("Enter your height (cm.):");
        double height = Double.parseDouble(heightText);


        int male = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION
        );

        double weight;


        if (male == JOptionPane.YES_OPTION) {

            weight = height - 100;

            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Mr. " + name +
                            "\nIf your height is " + height + " cm." +
                            "\nYour weight should be " + weight + " kg."
            );
        }

        else {
            int female = JOptionPane.showConfirmDialog(
                    null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION
            );

            if (female == JOptionPane.YES_OPTION) { // ผู้หญิ

                weight = height - 110;

                JOptionPane.showMessageDialog(
                        null,
                        "Hello, Ms. " + name +
                                "\nIf your height is " + height + " cm." +
                                "\nYour weight should be " + weight + " kg."
                );
            }

            else {

                JOptionPane.showMessageDialog(
                        null,
                        "You can use BMI to measure your weight and height."
                );
            }
        }
    }
}