//Author: Daniel Flesch
//Date: 04/01/24
// A while loop that calculates the total & average of a set of scores until the user quits the program

import java.util.Scanner;

public class Scores{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int score = 0;

        while(score != -1){
            System.out.println("Enter a score or -1 to quit: ");
            score = input.nextInt();
            total += score;
            count++;
        }

        double average = (double)total / count;
        

        if(score == -1){
            System.out.println("\nThe total of the scores is: " + total);
            System.out.println("The average of the scores is: " + average);
            // break;
        }
    }
}