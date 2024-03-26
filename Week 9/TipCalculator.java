// Author Daniel Flesch
// Date: 03/20/24
// Calculates the tip for a meal based on the total cost of the meal and the quality of the service.
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        System.out.println("Enter the total cost of your meal: ");
        double totalAmount = total.nextDouble();

        Scanner service = new Scanner(System.in);
        System.out.println("Enter the quality of service (1 = Dissatified, 2 = Satisfied, 3 = Totally Satisfied): ");
        int serviceQuality = service.nextInt();

        double tipAmount = 0;

        if (serviceQuality == 1) {
            tipAmount = totalAmount * 0.10;
            System.out.printf("You tipped $%.2f and your bill total was $%.2f", tipAmount, totalAmount);
        }
        
        else if (serviceQuality == 2) {
            tipAmount = totalAmount * .15;
            System.out.printf("You tipped $%.2f and your bill was $%.2f", tipAmount, totalAmount);
        }

        else if (serviceQuality == 3) {
            tipAmount = totalAmount * .20;
            System.out.printf("You tipped $%.2f and your bill was $%.2f", tipAmount, totalAmount);
        }

        else {
            System.out.println("Invalid input try again.");
            return;
        }
    }
}
