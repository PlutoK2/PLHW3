public abstract class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected boolean isCheckedOut;

    // Constructor
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
