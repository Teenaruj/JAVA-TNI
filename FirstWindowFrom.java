import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowFrom {
    private JPanel first_win_form;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton submitButton;
    private JButton resetButton;
    private JLabel firstname;
    private JLabel lastname;
    public JFrame frame;

    public FirstWindowFrom(){
        frame = new JFrame();
        frame.setContentPane(first_win_form);
        frame.setTitle("My Window Form");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (true) {
                    if (txt_firstname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill your First Name 0r Last Name",
                                null, JOptionPane.WARNING_MESSAGE);
                        break;
                    } else if (txt_lastname.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill your First Name 0r Last Name",
                                null, JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Hello! " + txt_firstname.getText() + " "
                            + txt_lastname.getText());
                    break;
                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText("");
                txt_lastname.setText("");


            }
        });
    }

    public static void main(String[] args) {
        FirstWindowFrom winfrom = new FirstWindowFrom();

    }
}
