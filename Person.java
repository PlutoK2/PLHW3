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
