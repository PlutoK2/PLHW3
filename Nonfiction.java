
public class Nonfiction extends Book {

    public Nonfiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    
    public String describe() {
        return "Non-Fiction Book: " + title + " by " + author;
    }
}

