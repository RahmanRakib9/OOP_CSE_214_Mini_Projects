
/**
 * MainClass
 */
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Display welcome message
        System.out.println("===============");
        System.out.println("Welcome to Contact Management System");
        System.out.println("===============");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Find Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            // scanner.nextLine(); // Consume the newline character

            

        }

    }
}