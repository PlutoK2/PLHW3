
public class Fiction extends Book {

    public Fiction(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    
    public String describe() {
        return "Fiction Book: " + title + " by " + author;
    }
}
