import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    // function that print option messages
    public static void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        display("Welcome to Library Management Application");

        //list for storing the user and the book
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();

        while (true) {
            display("Enter 1 for registering a book");
            display("Enter 2 for show all books");
            display("Enter 3 for registering user");
            display("Enter 4 for show all users");
            display("Enter 5 for borrow a book");
            display("Enter 6 for return the book");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // import classes where all the core functionalities are defined
            BookRelatedOperation bookRelatedOperation = new BookRelatedOperation();
            UserRelatedOperation userRelatedOperation = new UserRelatedOperation();
            BorrowBook borrowBook = new BorrowBook();

            switch (choice) {
                case 1:
                    books.add(bookRelatedOperation.register());
                    break;
                case 2:
                    bookRelatedOperation.show(books);
                    break;
                case 3:
                    users.add(userRelatedOperation.register());
                    break;
                case 4:
                    userRelatedOperation.show(users);
                    break;
                case 5:
                    borrowBook.borrow(users, books);
                    break;
                case 6:
                    borrowBook.returnBook(users);
                default:
            }
        }

    }
}
