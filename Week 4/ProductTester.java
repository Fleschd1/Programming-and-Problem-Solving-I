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

    }

}
