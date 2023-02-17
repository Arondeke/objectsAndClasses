package HW_objectsAndClasses;

import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && authorOfBook.equals(book.authorOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorOfBook, year);
    }

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

    public String toString() {
        return "название " + this.name + " автор " + this.authorOfBook + "год издания" + this.year;
    }
}