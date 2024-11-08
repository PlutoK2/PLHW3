/*
    This code  is a specialized subclass of Book that adds a custom description method, specifically designed to describe nonfiction books.

    Args:
         (Nonfiction(String title, String author, String isbn)): This constructor initializes a Nonfiction object by passing title, author, and isbn to the Book class constructor using the super() call.
    
         Returns:
         (describe()): This method returns a String that describes the nonfiction book
     */
public class Nonfiction extends Book {

    public Nonfiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    
    public String describe() {
        return "Non-Fiction Book: " + title + " by " + author;
    }
}

