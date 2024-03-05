//Author:  Daniel Flesch
//Date:   02/28/2024
//Creates a word game by taking in various inputs and creates a sentence
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        //Inputs
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner city = new Scanner(System.in);
        Scanner college = new Scanner(System.in);
        Scanner profession = new Scanner(System.in);
        Scanner animal = new Scanner(System.in);
        Scanner petName = new Scanner(System.in);

        //Prompts
        System.out.println("Enter your name: ");
        String nameInput = name.nextLine();

        System.out.println("Enter your age: ");
        int ageInput = age.nextInt();

        System.out.println("Enter the name of a city: ");
        String cityInput = city.nextLine();

        System.out.println("Enter the name of a college: ");
        String collegeInput = college.nextLine();

        System.out.println("Enter a profession: ");
        String professionInput = profession.nextLine();

        System.out.println("Enter a type of animal: ");
        String animalInput = animal.nextLine();
        
        System.out.println("Enter a pet's name: ");
        String petNameInput = petName.nextLine();

        //Output
        System.out.println("\nThere once was a person named " + nameInput + " who lived in " + cityInput + ". At the age of " + ageInput + ", " + nameInput + " went to college at " + collegeInput + ". " + nameInput + " graduated and went to work as a " + professionInput + ". Then, " + nameInput + " adopted a(n) " + animalInput + " named " + petNameInput + ". They both lived happily ever after!\n");
    }
}
