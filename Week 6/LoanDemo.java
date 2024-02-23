//Author Daniel Flesch
// Date: 2/22/24
//Tests the loan class
public class LoanDemo {

    public static void main(String[] args){
    Loan l1 = new Loan();
    double roundedNumber = Math.round(l1.calculate() * 100) /100;
    System.out.printf("Your new total amount: %.2f%n", roundedNumber);
    }
}