// Author Daniel Flesch
// Date: 03/27/24
// Displays calories burned after 5, 10, 15, 20, 25, and 30 minutes on treadmill

public class CaloreisBurned {
    public static void main(String[] args) {

        for (int minutes = 0; minutes < 30; minutes++) {
            double calories = minutes * 3.6;
            if (minutes == 5)
                System.out.printf("\n5 minutes: %.2f calories burned.", calories);

            else if (minutes == 10)
                System.out.printf("\n10 minutes: %.2f calories burned.", calories);
            else
                System.out.println("ya");
        }
            
    }
}
