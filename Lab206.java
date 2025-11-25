import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
                DecimalFormat frm = new DecimalFormat("#.00");

                String numberOfCustomerInput = JOptionPane.showInputDialog(null,
                        "How many customer?",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);
                int numberOfCustomer = Integer.parseInt(numberOfCustomerInput);

                double price_with_net = (299*numberOfCustomer)*1.07;

                String discountInput = JOptionPane.showInputDialog(null,
                        "Price with NET is " + frm.format(price_with_net) + " baht." +
                                "\nHow much of discount(%) on your coupon?",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);
                int discount = Integer.parseInt(discountInput);

                double totalPrice = price_with_net-(price_with_net*discount/100);

                String customerPaidInput = JOptionPane.showInputDialog(null,
                        "Total price is " + frm.format(totalPrice) + " baht." +
                                "\nEnter the amount the customer paid:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);
                double customerPaid = Double.parseDouble(customerPaidInput);

                double change = customerPaid-totalPrice;

                JOptionPane.showMessageDialog(null,
                        "Total price is " + frm.format(totalPrice) + " baht." +
                                "\nCustomer paid " + frm.format(customerPaid) + " baht." +
                                "\n Get change " + frm.format(change) + " baht.");
    }
}
