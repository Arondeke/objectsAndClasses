package HW_objectsAndClasses;

public class Book {

    private String name;
    private Author authorOfBook;
    private int year;

    public Book(String name, Author authorOfBook, int year) {
        this.name = name;
        this.authorOfBook = authorOfBook;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthorOfBook() {
        return this.authorOfBook;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }
}