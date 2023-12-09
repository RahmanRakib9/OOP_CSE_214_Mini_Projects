/*
This Book class is responsible for create a new book by defining book's id,author and price
*/
public class Book {
    private String name; // id, author, price

    Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
