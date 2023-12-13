
import java.util.HashMap;
import java.util.Map;

/**
 * Customer
 */
public class Customer {

    private Map<Product, Integer> shoppingCart;

    // initialize customer class with a hashmap
    public Customer() {
        this.shoppingCart = new HashMap<>();
    }

    /*
     * It receive a product class and quantity as a parameter and update the
     * quantity of a product using put method
     */
    public void addToCart(Product product, int quantity) {
        shoppingCart.put(product, shoppingCart.getOrDefault(product, 0) + quantity);
    }

    /*
     * Iterate the shoppingCart and calculate the total price
     */
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : shoppingCart.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    /*
     * Display the order details
     */
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        for (Map.Entry<Product, Integer> entry : shoppingCart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
        System.out.println("Grand Total: $" + calculateTotal());
    }

}