/*
    This code inherits from Person, so the name and id properties are in the Member class..

    Args:
        super(name, id): calls the constructor of the superclass Person, passing these two arguments (name and id) to it.

    Returns:
         (describe()): Returns a String that provides a description of the member.
     */
public class Member extends Person {

    public Member(String name, String id) {
        super(name, id);
    }

    
    public String describe() {
        return "Member: " + name + " with ID: " + id;
    }
}
