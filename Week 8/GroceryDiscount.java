//Author Daniel Flesch
//Date: 03/05/24
//Rewards members for spending a certain amount, members recieve a % based coupon.
import java.util.Scanner;

public class GroceryDiscount {
    static Scanner total = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the cost of your groceries: ");
        double totalAmount = total.nextDouble();

        if(totalAmount < 10)
            System.out.println("You are not eligible for a coupon this time.");

        else if(totalAmount >= 10 & totalAmount <= 60){
            double coupon = totalAmount * 0.08;
            System.out.printf("You win a discount coupon of $ %.2f (8%% of your purchase)", coupon);
        } 
        else if(totalAmount > 60 & totalAmount <= 150){
            double coupon = totalAmount * 0.10;
            System.out.printf("You win a discount coupon of $ %.2f (10%% of your purchase)", coupon);
        } 
        
        else if(totalAmount > 150 & totalAmount < 210){
            double coupon = totalAmount * 0.12;
            System.out.printf("You win a discount coupon of $ %.2f (12%% of your purchase)", coupon);
        } 
        
        else if(totalAmount >= 210){
            double coupon = totalAmount * 0.14;
            System.out.printf("You win a discount coupon of $ %.2f (14%% of your purchase)", coupon);
        }
    }
}