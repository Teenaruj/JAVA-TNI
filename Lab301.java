import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("This is Zero number.");
        } else {
            String evenOdd = (n % 2 == 0) ? "Even" : "Odd";
            String sign = (n > 0) ? "Positive" : "Negative";
            System.out.printf("This number is %s and %s number.%n", evenOdd, sign);
        }
        sc.close();
    }
}
