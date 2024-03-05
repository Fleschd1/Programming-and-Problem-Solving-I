// Author Daniel Flesch
// Date: 03/05/24
// A class that compares two numbers given by the user and prints if one is greater.
import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args){
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = n1.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = n2.nextInt();

    if (number1 > number2)
        System.out.println("\n"+ number1 + " is larger than " + number2);
    else if (number2 > number1)
        System.out.println("\n"+ number2 + " is larger than " + number1);
    else
        System.out.println("\nBoth numbers are equal.");
    }
}
