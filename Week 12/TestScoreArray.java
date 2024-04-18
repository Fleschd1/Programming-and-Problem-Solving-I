//Author: Daniel Flesch
// Date 4/10/2024
// Using arrays
import java.util.Scanner;
public class TestScoreArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalScores = 0;
        double[] values = new double[5];

        System.out.println("Enter a score: ");
        values[0] = input.nextDouble();
        double maxVal = values[0];
        double minVal = values[0];
        totalScores += values[0];

        for(int count = 1; count < values.length; count++){
            System.out.println("\nEnter a score: ");
            values[count] = input.nextDouble();
            totalScores += values[count];
            System.out.println("\nScore " + (count + 1) + " is " + values[count]);

            if (values[count] > maxVal){
                maxVal = values[count];
            }

            if (values[count] < minVal){
                minVal = values[count];
            }
        }
    
        
    double average = totalScores/values.length;

    System.out.printf("\nAverage: %.2f  Total: %.2f   Max: %.2f   Min: %.2f", average, totalScores, maxVal, minVal);
    }
}
