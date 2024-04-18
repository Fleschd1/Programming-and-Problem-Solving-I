// Author: Daniel Flesch
//Date: 03/26/2024
//Using a do-while loop
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;

        do {
            System.out.println("Enter a number 1-10: ");
            result = input.nextInt();

        } 
        while(result < 1 || result > 10);

        if (result >= 1 && result <= 10){
            System.out.println("You entered a valid number: " + result);
        }
    }
}

