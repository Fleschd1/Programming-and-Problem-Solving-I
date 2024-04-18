//Author: Daniel Flesch
// Date 4/10/2024
// Using arrays
import java.util.Scanner;
public class SalesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;
        double[] saleValues = new double[5];

        System.out.println("Enter a sale: ");
        saleValues[0] = input.nextDouble();
        System.out.printf("\nSale 1 is %.2f", saleValues[0]);

        double maxVal = saleValues[0];
        totalSales += saleValues[0];

        for(int i = 1; i < saleValues.length; i++){
            System.out.println("\nEnter a Sale: ");
            saleValues[i] = input.nextDouble();
            totalSales += saleValues[i];
            System.out.printf("\nSale " + (i + 1) + " is %.2f", saleValues[i]);

            if (saleValues[i] > maxVal){
                maxVal = saleValues[i];
            }
        }
    
        
    double average = totalSales/saleValues.length;

    System.out.printf("\nAverage: %.2f  Total: %.2f   Max: %.2f", average, totalSales, maxVal);
    }
}
