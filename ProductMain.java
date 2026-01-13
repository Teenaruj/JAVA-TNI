import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Product stock system");
        Product product = new Product();

        product.name = JOptionPane.showInputDialog(null,"Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter product stock:"));

        int addItems = JOptionPane.showConfirmDialog(null,"Do you want to add more item?",
                "Select an option",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (addItems == JOptionPane.YES_OPTION) {
            product.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many Items to add in stock:")));
        }

        int changePrice = JOptionPane.showConfirmDialog(null,"Do you want to change price?",
                "Select an option",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (changePrice == JOptionPane.YES_OPTION) {
            product.changePrice(Double.parseDouble(JOptionPane.showInputDialog("How much in the new price per item:")));


        }

        product.showInfo();
    }
}
