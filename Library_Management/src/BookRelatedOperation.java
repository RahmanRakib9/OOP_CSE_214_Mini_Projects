/*
This file is responsible for book related operations like register a new book,display books,find book
by book name
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BookRelatedOperation {

    // function for register a new book
    public Book register() {
        System.out.println("Enter book name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Book book = new Book(name);
        return book;
    }

    // function that display all the books
    public void show(ArrayList<Book> books) {
        int i = 1;
        for (Book b : books) {
            System.out.println((i++) + ": " + "Name: " + b.getName());
        }
    }

    // function that perform find book operation based on book name
    public Book findBook(ArrayList<Book> books){
        System.out.println("Enter book name");
        String name = (new Scanner(System.in)).nextLine();

        for(int i = 0;i<books.size();i++){
            Book b = books.get(i);
            if(b.getName().equalsIgnoreCase(name) == true){
                System.out.println("Name: "+ b.getName());
                return b;
            }
        }
        System.out.println("No book is found");
        return null;
    }

}