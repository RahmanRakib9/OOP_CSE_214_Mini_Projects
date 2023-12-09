public class MainClass {
    // function that print option messages
    public static void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        display("Welcome to Library Management Application");

        while (true) {
            display("1 for registering book");
            display("2 for show all books");
            display("3 for registering user");
            display("4 for show all users");
            display("5 borrow a book");
            display("6 return the book");
        }

    }
}
