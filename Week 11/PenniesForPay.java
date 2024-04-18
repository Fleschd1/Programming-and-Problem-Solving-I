//Author: Daniel Flesch
// Date 04/01/24
// Input the days of work and the amount of pennies you will earn each day will be doubled each day
import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalPay = 0;
        int pennies = 1;
        double pay = 0;

        System.out.println("Enter the number of days you will work: ");
        int days = input.nextInt();

        if(days < 1){
            System.out.println("Invalid input.");
            return;
        } 

        System.out.printf("%-5s %s%n", "Day", "Pennies Earned");

        for (int i = 1; i <= days; i++) {
            pay = pennies;
            System.out.printf("%-5d %.0f\n", i, pay);
            totalPay += pay;
            pay = pennies *= 2;
        }

        System.out.printf("Total pay: $%.2f", (totalPay/100));       
    }
}

