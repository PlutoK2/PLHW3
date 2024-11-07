
public class Member extends Person {

    public Member(String name, String id) {
        super(name, id);
    }

    
    public String describe() {
        return "Member: " + name + " with ID: " + id;
    }
}
