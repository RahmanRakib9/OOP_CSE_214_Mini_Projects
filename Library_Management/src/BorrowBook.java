import java.util.ArrayList;

/**
 * This file is responsible for borrow a book
 * if user has already logged-in then he can borrow the books otherwise
 * he can't
 */
public class BorrowBook {
    public void borrow(ArrayList<User> users, ArrayList<Book> books){
        User user = (new UserRelatedOperation()).find(users);
        if(user == null){
            System.out.println("Please register first");
            return;
        }

        if(user.getBook() != null){
            System.out.println("Please return the \""+ user.getBook().getName() +"\" book first");
            return;
        }

        Book book = (new BookRelatedOperation()).findBook(books);
        if(book == null){
            System.out.println("Sorry, chose another one");
            return;
        }

        user.setBook(book);
        System.out.println("Congrats, the " + book.getName() + " book is assigned to you");

    }

    public void returnBook(ArrayList<User> users){
        User user = (new UserRelatedOperation()).find(users);
        if(user == null){
            System.out.println("Please register first");
            return;
        }

        if(user.getBook() == null){
            System.out.println("Sorry, you have no book to return");
            return;
        }


        System.out.println("Thank you for returning the "+ user.getBook().getName()+" book");
        user.setBook(null);

    }
}