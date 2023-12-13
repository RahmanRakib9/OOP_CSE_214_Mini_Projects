
/**
 * This Product class is responsible for create a new product by product name
 * and price;
 */
public class Product {
    private String name;
    private double price;

    // initialize product class by using constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " -TK" + price;
    }

}