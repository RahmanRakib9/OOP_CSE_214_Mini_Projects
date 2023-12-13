import java.util.Scanner;

// GroceryStoreApp.java
public class MainClass {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 2.5);
        Product milk = new Product("Milk", 1.5);
        Product eggs = new Product("Eggs", 1.0);

        Customer customer = new Customer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Products:");
        System.out.println(bread);
        System.out.println(milk);
        System.out.println(eggs);

        boolean continueShopping = true;
        while (continueShopping) {
            System.out.print("Enter product name to add to the cart (type 'done' to finish): ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("done")) {
                continueShopping = false;
            } else {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                Product selectedProduct = null;

                switch (productName.toLowerCase()) {
                    case "bread":
                        selectedProduct = bread;
                        break;
                    case "milk":
                        selectedProduct = milk;
                        break;
                    case "eggs":
                        selectedProduct = eggs;
                        break;
                    default:
                        System.out.println("Product not found. Please enter a valid product name.");
                        continue;
                }

                customer.addToCart(selectedProduct, quantity);
                System.out.println(quantity + " " + selectedProduct + " added to the cart.");
            }
        }

        customer.displayOrderDetails();

        scanner.close();
    }
}
