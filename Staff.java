/*
    This code has Staff extends the class Person, meaning Staff inherits all properties and methods of Person, and can also define its own additional behaviors.
    Args:
        String name: The name of the staff member.
        String id: The unique identifier for the staff member.
        registerMember(library library, Member member):
                library: An object of type library where the member will be registered.
                member: An object of type Member representing the person to be registered.
        registerBook(library library, Book book):
                library: An object of type library where the book will be added.
                book: An object of type Book representing the book to be added.

    Returns:
         (describe()): 
            String (returns a string that describes the staff member, including their name and ID).
        void: This means the method doesn't return any value.
        String: This means the method returns a string value.
     */


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
