//Author: Daniel Flesch
//Date: 04/18/24
// Continues the Product class and puts the products in an array list.
import java.util.ArrayList;
public class ProductArrayListDemo {
    
    public static class Product {
        // instance variables
        private String name;
        private double price;

    /**
     * No arguement constructor for a product
     */
        public Product()
        {
        // initialise instance variables
        name = "";
        price = 0.0;
        }
    /**
     * A Product constructor with two arguements
     * 
     * @param n
     * @param a
     */
        public Product(String n, double a)
        {
            // initialise instance variables
        name = n;
        price = a;

        }
    /**
     * Sets the name of the product.
     * @param n
     */
        public void setName(String n)
        {
            name = n;
        }

    /**
     * Sets the price of the product.
     * @param a
     */
        public void setPrice(double a)
        {
            price = a;
        }

        /**
         * Obtains the name of the product and returns it
         * @return name
         */
        public String getName()
        {
            return name;
        }

    /**
     * Obtains the price of the product and returns it
     * @return price
     */
        public double getPrice()
        {
            return price;
        }

    /**
     * Reduces the price of the product by a specified amount
     * @param reductionAmount
     */
        public void reducePrice(double reductionAmount)
        {
            price = price - reductionAmount;
        }
    }
    public static void main(String[] args) {
        ArrayList productList = new ArrayList<Product>(3);

        Product iPhone = new Product("iPhone 12", 600);
        Product appleWatch = new Product("Apple Watch", 200);
        Product airTag = new Product("AirTag", 50);
        
        productList.add(iPhone);
        productList.add(appleWatch);
        productList.add(airTag);

        for (int count = 0; count < productList.size(); count++) {
            Product i = (Product) productList.get(count);
            System.out.println(i.getName() + " costs $" + i.getPrice());
            
        }
    }
}
