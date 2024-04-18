//Author Daniel Flesch
// Date: 04/01/2024
// Loops
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Part A
        int sumEven = 0;
        for (int i = 2; i <= 100; i += 2) {
            sumEven += i;
        }
        System.out.println("Sum of even numbers between 2 and 100: " + sumEven);

        // Part B
        int sumSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += i * i;
        }
        System.out.println("Sum of squares between 1 and 100: " + sumSquares);

        // Part C
        for (int i = 0; i <= 20; i++) {
            double powerOf2 = Math.pow(2, i);
            System.out.println(powerOf2);
        }

        // Part D
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter a number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int n2 = scanner.nextInt();
        
        int sumOdd = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println("Sum of odd numbers between " + n1 + " and " + n2 + ": " + sumOdd);
    }
}