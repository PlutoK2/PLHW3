
public class Staff extends Person {

    public Staff(String name, String id) {
        super(name, id);
    }

   
    public String describe() {
        return "Staff: " + name + " with ID: " + id;
    }

    // Method to register a member to the library
    public void registerMember(library library, Member member) {
        library.registerMember(member);
    }

    // Method to register a book to the library
    public void registerBook(library library, Book book) {
        library.addBook(book);
    }
}
