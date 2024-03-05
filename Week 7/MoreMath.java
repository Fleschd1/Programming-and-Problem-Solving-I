// @author Daniel Flesch
// @version 2024-02-28
// This class tests more math methods.
import java.util.Scanner;

public class MoreMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n2 = input2.nextInt();

        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        double average = (n1 + n2)/2.0;
        int absolute = Math.abs(n1-n2);
        int maximum = Math.max(n1, n2);
        int minimum = Math.min(n1, n2);

        System.out.printf("\nThe sum: %13d", sum);
        System.out.printf("\nThe difference: %5d", difference);
        System.out.printf("\nThe product: %10d", product);
        System.out.printf("\nThe average: %12.2f%n", average);
        System.out.printf("\nThe absolute value: %d", absolute);
        System.out.printf("\nThe maximum: %9d", maximum);
        System.out.printf("\nThe minimum: %9d", minimum);
    }
}
 