public class libraryTest {

    public static void main(String[] args) {
        // Create library instance
        library library = new library();

        // Create staff members
        Staff staff1 = new Staff("Kaniya", "S227");
        Staff staff2 = new Staff("Kyara", "S2221");

        // Register staff to the library
        library.registerStaff(staff1);
        library.registerStaff(staff2);

        // Create members
        Member member1 = new Member("Ivan", "M001");
        Member member2 = new Member("Cassie", "M002");

        // Register members to the library
        library.registerMember(member1);
        library.registerMember(member2);

        // Create books
        Book fictionBook = new Fiction("Harry Potter and the Sorcerer's stone ", "J. K. Rowling", "12345");
        Book nonFictionBook = new Nonfiction("Sapiens", "Yuval Noah Harari", "67890");

        // Register books to the library
        staff1.registerBook(library, fictionBook);
        staff2.registerBook(library, nonFictionBook);

        // List books, members, and staff
        System.out.println("Books in the Library:");
        library.listBooks();
        
        System.out.println("\nMembers in the Library:");
        library.listMembers();
        
        System.out.println("\nStaff in the Library:");
        library.listStaff();

        // Test check out and return of books
        fictionBook.checkOut();
        System.out.println("\nAfter checking out the book:");
        System.out.println(fictionBook.describe() + " Checked out: " + fictionBook.isCheckedOut);

        fictionBook.returnBook();
        System.out.println("\nAfter returning the book:");
        System.out.println(fictionBook.describe() + " Checked out: " + fictionBook.isCheckedOut);
    }
}
