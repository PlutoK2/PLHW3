
import java.util.ArrayList;

public class library {
    ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<Staff> staff;

    // Constructor
    public library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        staff = new ArrayList<>();
    }

    // Add book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Register a new member to the library
    public void registerMember(Member member) {
        members.add(member);
    }

    // Register a new staff to the library
    public void registerStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    // List all books in the library
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.describe());
        }
    }

    // List all members in the library
    public void listMembers() {
        for (Member member : members) {
            System.out.println(member.describe());
        }
    }

    // List all staff in the library
    public void listStaff() {
        for (Staff staffMember : staff) {
            System.out.println(staffMember.describe());
        }
    }
}
