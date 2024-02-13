
// Author Daniel Flesch
// Date: 02/11/24
// Creates a product with a name and a price
/**
 * A Class that creates a product with a name and price.
 * 
 */
public class Product {
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
}
