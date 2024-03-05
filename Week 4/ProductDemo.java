//Author Daniel Flesch
// Date: 02/11/24
//Tests the Product class.
import java.util.Scanner;
public class ProductDemo {
    public static void main(String[] args){
        Product product1 = new Product();
        product1.setName("iPad");
        product1.setPrice(799.99);

        System.out.println(product1.getName() + ", $" + product1.getPrice());


        // Supply a program ProductDemo that makes a product, prints the product name and price, reduces its prices by $5.00, and then prints the reduced price.
        Product product2 = new Product("MacBook Pro", 1999.99);
        System.out.println(product2.getName() + ", $" + product2.getPrice());
        product2.reducePrice(5.00);
        System.out.println(product2.getName() + ", Reduced Price: $" + product2.getPrice());

        //65 & Older Discount
        Scanner age = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int ageInput = age.nextInt();

        if (ageInput >= 65){
            product1.reducePrice(100);
            product2.reducePrice(300);
            System.out.println("\n"+product1.getName() + ", Age Reduced Price: $" + product1.getPrice()+"\n");
            System.out.println(product2.getName() + ", Age Reduced Price: $" + product2.getPrice());
        }

        else {
            System.out.println("Age doesn't meet minuimum requirement.");
            System.out.println("\n"+product1.getName() + ", $" + product1.getPrice()+"\n");
            System.out.println(product2.getName() + ", $" + product2.getPrice());
        }
    }

}
