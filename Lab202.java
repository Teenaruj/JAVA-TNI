import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#.#");
        System.out.print("Input number 1: ");
        double number_1 = scanner.nextInt();

        System.out.print("Input number 2: ");
        double number_2 = scanner.nextInt();

        double Summation = number_1 + number_2;
        double Subtraction = number_1 - number_2;
        double Multiplication = number_1 * number_2;
        double Division = number_1 / number_2;
        double Modulus = number_1 % number_2;

        System.out.println("Subtraction = " + frm.format(Summation));
        System.out.println("Subtraction = " + frm.format(Subtraction) );
        System.out.println("Multiplication = " + frm.format(Multiplication) );
        System.out.println("Division = " + frm.format(Division) );
        System.out.println("Modulus = " + frm.format(Modulus) );






    }
}
