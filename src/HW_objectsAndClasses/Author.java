package HW_objectsAndClasses;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLasttName() {
        return this.lastName;
    }
}
