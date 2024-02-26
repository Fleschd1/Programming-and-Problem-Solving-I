//Author Daniel Flesch
// Date: 02/11/24
//Tests the Product class.

public class ProductTester {
    public static void main(String[] args)
    {
        Product product1 = new Product();
         product1.setName("iPad");
         product1.setPrice(799.99);

         System.out.println(product1.getName() + ", $" + product1.getPrice());

        Product prod2 = new Product("iPhone 14", 999.99);
        System.out.println(prod2.getName() + ", $" + prod2.getPrice());

        // Supply a program ProductDemo that makes a product, prints the product name and price, reduces its prices by $5.00, and then prints the reduced price.
        Product product2 = new Product();
        product2.setName("MacBook Pro");
        product2.setPrice(1999.99);
        System.out.println(product2.getName() + ", $" + product2.getPrice());
        product2.reducePrice(5.00);
        System.out.println(product2.getName() + ", Reduced Price: $" + product2.getPrice());
    }

}
