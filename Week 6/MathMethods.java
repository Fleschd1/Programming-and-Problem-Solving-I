//Author: Daniel Flesch
// Date: 02/20/2024
//Using Math class methods

public class MathMethods {
    public static void main(String[] args){
    // 1. the absolute value of -15
    int abs1 = Math.abs(-15);
    System.out.println("The absolute value of -15 is: " + abs1 + "\n");

    // 2. square root of 225
    double sqrt1 = Math.sqrt(225);
    System.out.println("The square root of 225 is: " + sqrt1 + "\n");

    // 3. closest integer to 15.345
    double round1 = Math.round(15.345);
    System.out.println("The closest integer to 15.345 is: " + round1 + "\n");

    // 4. 6 to the 4th power
    double pow1 = Math.pow(6, 4);
    System.out.println("6 to the 4th power is: " + pow1 + "\n");

    // 5. random number between 0 and 100
    double randomNum1 = Math.random() * 100;
    randomNum1 = Math.round(randomNum1);
    System.out.println("A random number between 0 and 100 is: " + randomNum1 + "\n");

    // 6. Also, copy and execute the following statements:
    double result1 = Math.floorDiv(50, 7);
    System.out.println("#6 Result of floorDiv is: " + result1 + "\n");
    double result2 = Math.floorDiv(-50, 7);
    System.out.println("#6 Result of floorDiv with a negative number is: " + result2 + "\n");

    }
}
