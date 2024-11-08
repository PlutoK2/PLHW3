/*
    This code defines a Java class called Fiction that extends a superclass called Book.

    Args:
        super(title, author, isbn): calls the constructor of the superclass Book and passes the arguments (title, author, and isbn) to it.

    Returns:
         (describe()): Returns a String describing the book in the format "Fiction Book: <title> by <author>".
     */
public class Fiction extends Book {

    public Fiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    
    public String describe() {
        return "Fiction Book: " + title + " by " + author;
    }
}
