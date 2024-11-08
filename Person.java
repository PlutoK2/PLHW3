/*
    This code is meant to represent a person with a name and an id.

    Args:
        Person(String name, String id): The constructor takes two String arguments (name and id) to initialize the name and id fields.
    
        Returns:
         (describe()): return a String describing the specific person. The actual return value of describe() will depend on the subclass implementation
*/

    public abstract class Person {
    protected String name;
    protected String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to describe the person type
    public abstract String describe();
}
