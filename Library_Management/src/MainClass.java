import java.util.Scanner;

public class MainClass {
    // function that print option messages
    public static void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        display("Welcome to Library Management Application");

        while (true) {
            display("Enter 1 for registering a book");
            display("Enter 2 for show all books");
            display("Enter 3 for registering user");
            display("Enter 4 for show all users");
            display("Enter 5 for borrow a book");
            display("Enter 6 for return the book");

            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();

            


        }

    }
}
