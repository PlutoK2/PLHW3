/*
    This code defines some common properties and methods that all book types will inherit, but it leaves some details (like how to describe the book) to be implemented by subclasses..

    Args:
        Book(String title, String author, String isbn): 
            String title, String author, String isbn: This method should return a string that describes the book and  sets isCheckedOut to false.
        
    Returns:
         void:
         String: This method should return a string that describes the book. 
     */


public abstract class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected boolean isCheckedOut;

    /* 
     * @brief Constructor
     */ 
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    // Method to check out the book
    public void checkOut() {
        isCheckedOut = true;
    }

    // Method to return the book
    public void returnBook() {
        isCheckedOut = false;
    }

    // Abstract method to describe the book type
    public abstract String describe();
}
