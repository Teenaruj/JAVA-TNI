import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("No numbers to process.");
            sc.close();
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int x = sc.nextInt();
            if (x > max) max = x;
            if (x < min) min = x;
            if (x % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println();
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

        sc.close();
    }
}
