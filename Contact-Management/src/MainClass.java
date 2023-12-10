// import java.util.Scanner;

// // Main.java
// public class MainClass {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         ContactManager contactManager = new ContactManager();

//         while (true) {
//             System.out.println("\nContact Management System");
//             System.out.println("1. Add Contact");
//             System.out.println("2. Display Contacts");
//             System.out.println("3. Find Contact");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter contact name: ");
//                     String name = scanner.nextLine();
//                     System.out.print("Enter phone number: ");
//                     String phoneNumber = scanner.nextLine();
//                     Contact newContact = new Contact(name, phoneNumber);
//                     contactManager.addContact(newContact);
//                     break;
//                 case 2:
//                     contactManager.displayContacts();
//                     break;
//                 case 3:
//                     System.out.print("Enter contact name to find: ");
//                     String searchName = scanner.nextLine();
//                     Contact foundContact = contactManager.findContact(searchName);
//                     if (foundContact != null) {
//                         System.out.println("Contact found: " + foundContact);
//                     } else {
//                         System.out.println("Contact not found.");
//                     }
//                     break;
//                 case 4:
//                     System.out.println("Exiting the Contact Management System.");
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter a valid option.");
//             }
//         }
//     }
// }
