import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) System.out.print(i + " ");
        } else {
            for (int i = a; i >= b; i--) System.out.print(i + " ");
        }
        System.out.println();

        if (a <= b) {
            for (int i = a; i <= b; i++) if (i % 2 == 0) System.out.print(i + " ");
        } else {
            for (int i = a; i >= b; i--) if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
