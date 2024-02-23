// Author Daniel Flesch
//Date 02/21/24
// A class that calculates loan percentages


public class Loan {
    private double rate = .0656;
    private int years = 15;
    private float principal = 200000;
    
    public Loan() {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }
    //A = P * (1 + r * t), where A is the total amount, P is the principal, r is the annual interest rate, and t is the number of years.
    public double calculate(){
        
        double result = this.principal * (1 + this.rate * this.years);

        return result;
    }
}
